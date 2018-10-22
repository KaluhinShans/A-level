import java.util.Scanner;

class Multiplication {

    public static void main(String[] args) {
        System.out.println("Give me first number: ");
        long first = getInfo();
        System.out.println("Give me second number: ");
        long second = getInfo();

        boolean check = check(first, second);

        if (check == true) {
            long result = karacubaMultiplication(first, second);
            System.out.println("You answer: " + result);
        } else {
            long result = easyMultiplication(first, second);
            System.out.println("You have different size of number, or you have little numbers, so I can make only easy multiplication:");
            System.out.println(result);
        }
    }

    public static long getInfo() {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        return number;
    }

    public static long easyMultiplication(long a, long b) {
        long result = a * b;
        return result;
    }

    public static int getSize(long number) {
        int counter = 0;
        while (number != 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }

    public static boolean check(long first, long second) {
        boolean checker;
        int firstSize = getSize(first);
        int secondSize = getSize(second);

        if (firstSize != secondSize || firstSize < 4) {
            checker = false;
        } else {
            checker = true;
        }

        return checker;
    }

    public static long[] divivsion(long number) {
        long[] array = new long[2];

        int n = getSize(number);
        int part = n / 2;
        int hundreds = 10;

        for (int i = 1; i < part; i++) hundreds *= 10;

        array[0] = number / hundreds;
        array[1] = number % hundreds;

        return array;
    }

    public static long karacubaMultiplication(long first, long second) {
        long[] firstArray = divivsion(first);
        long[] secondArray = divivsion(second);

        long A = easyMultiplication(firstArray[0], secondArray[0]);
        long B = easyMultiplication(firstArray[1], secondArray[1]);
        long C = (firstArray[0] + firstArray[1]) * (secondArray[0] + secondArray[1]);

        long result = A * 10000 + (C - A - B) * 100 + B;

        return result;
    }
}