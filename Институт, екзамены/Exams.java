import java.util.Random;

class Exams{

    public static boolean exam(String name) {
        Teacher teacher = new Teacher();

        Random ran = new Random();
        int work = ran.nextInt(100);

        System.out.println(name + " pass work and wait results ");
        System.out.println(". . .");

        boolean result = teacher.evaluation(work);

        return result;
    }
}



