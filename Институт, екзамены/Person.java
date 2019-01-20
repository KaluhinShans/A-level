import java.util.Scanner;

class Person {
    static String name;
    static String surname;
    static int markZNO;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name: ");
        name = scan.nextLine();

        System.out.println("Surname: ");
        surname = scan.nextLine();

        System.out.println("Mark ZNO: ");
        markZNO = scan.nextInt();


        Faculty.register(name, surname, markZNO);
    }
}
