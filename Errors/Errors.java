public class Errors {

    public static void main(String[] args) {
        nullPointerException(); // Достаточно проверки через if на null
        arrayIndexOutOfBoundsException();//Достаточно проверки через if на длинну массива

        try {
            classCastException(); // Проверка через try-catch
        } catch (ClassCastException exe) {
            System.out.println("ERROR: Different types");
        }

        try {
            numberFormatException(); // Проверка через try-catch
        } catch (NumberFormatException exe) {
            System.out.println("ERROR: Line in number");
        }

    }


    public static void classCastException() {
        Object o = 10;
        System.out.println((Integer) o);
    }

    public static void nullPointerException() {
        Integer i = 5;
        if (i == null){
            System.out.println("ERROR: Link is null");
        }else{
            System.out.println(i);
        }
    }

    public static void numberFormatException() {
        String s = "2019";
        System.out.println(Integer.valueOf(s));
    }

    public static void arrayIndexOutOfBoundsException() {
        int[] a = {0, 1};
        int index = 1;
        if (index > a.length){
            System.out.println("ERROR: Wrong index");
        }else{
            System.out.println("You number is "+ a[index]);
        }
    }
}
