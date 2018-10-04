import java.util.Scanner;

class Horse {
    public static void main(String[] args) {
        System.out.println("Первое число это столбик, второе это строка. Поле 8 на 8, начиная с 1");

        int counter = getInfo();

        if (counter == 1) {
            System.out.println("Это возможно");
        } else {
            System.out.println("Это не возможно");
        }
    }

    public static int getInfo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Клетка нахождения коня: ");
        int locationY = scan.nextInt();  //первоначальное место по столбикам
        int locationX = scan.nextInt();  //первоначально место по строчкам
        System.out.println("Куда идем?  ");
        int futureLocationY = scan.nextInt();  //будущее место по столбикам
        int futureLocationX = scan.nextInt();  //будущее место по строкам

        int counter = test(locationX, locationY, futureLocationX, futureLocationY); // отдаем данные на тест

        return counter;
    }

    public static int test(int locationX, int locationY, int futureLocationX, int futureLocationY) {

        if ((futureLocationX > 8) || (futureLocationY > 8) || (locationX > 8) || (locationY > 8) ||  // проверка на выход за рамки
                (futureLocationX <= 0) || (futureLocationY <= 0) || (locationX <= 0) || (locationY <= 0)) {

            System.out.println("Вы вышли за рамки поля ");
            getInfo();  // Возвращаем пользователя в конец программы
            return 0;

        } else if ((locationX + 2 == futureLocationX) || (locationX - 2 == futureLocationX) &&  // если по строчкам конь идет на 2 то по столбикам на 1
                locationY + 1 == futureLocationY || locationY - 1 == futureLocationY) {          //Это конь идет в лево или в право
            return 1;
        } else if ((locationY + 2 == futureLocationY) || (locationY - 2 == futureLocationY) && // если по стобикам конь идет на 2 то строчкам на 1
                (locationX + 1 == futureLocationX) || (locationX - 1 == futureLocationX)) {    //Это конь идет вверх или вниз
            return 1;
        } else {  // если ничего не подходит то такого хода не может быть
            return 0;
        }
    }
}