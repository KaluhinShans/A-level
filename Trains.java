import java.util.Scanner;
import java.util.Random;

public class Trains {
    public static void main(String[] args) {
        getInfo();

    }

    public static void getInfo() {

        int a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Откуда едем? ");
        String fromWhere = scan.next();

        System.out.println("Куда едем? ");
        String where = scan.next();

        System.out.println("Сколько будет псажирских вагонов класса 2? ");
        a = scan.nextInt();
        int[] klass2 = new int[a];

        System.out.println("Сколько будет псажирских вагонов класса 1? ");
        a = scan.nextInt();
        int[] klass1 = new int[a];

        System.out.println("Сколько будет грузовых вагонов? ");
        a = scan.nextInt();
        int[] cargo = new int[a];

        System.out.println("Поезд едет от "+ fromWhere + " до " + where);

        getRandom(klass2, klass1, cargo);


    }

    public static void getRandom(int[] klass2, int[] klass1, int[] cargo) {

        Random ran = new Random();

        for (int i = 0; i < klass2.length; i++) {
            int a = ran.nextInt(100);
            klass2[i] = a;
        }

        for (int i = 0; i < klass1.length; i++) {
            int a = ran.nextInt(200);
            klass1[i] = a;
        }

        for (int i = 0; i < cargo.length; i++) {
            int a = ran.nextInt(100);
            cargo[i] = a;
        }

        paint(klass2, klass1, cargo);
    }

    public static void paint(int[] klass2, int[] klass1, int[] cargo) {


        System.out.print("<:Locomotive:]=");

        for (int i = 0; i <klass2.length ; i++) {
            System.out.print("[:Klass2:" + klass2[i] + ":pass:]=");
        }

        for (int i = 0; i <klass1.length ; i++) {
            System.out.print("[:Klass1:" + klass1[i] + ":pass:]=");
        }

        for (int i = 0; i <cargo.length ; i++) {
            System.out.print("[:Cargo:" + cargo[i] + "%:]=");
        }
    }
}