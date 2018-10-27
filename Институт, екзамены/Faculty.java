class Faculty {

    static String name = "Software Engineering";

    public static void register(String nameOfPerson, String surnameOfPerson, int markZNO) {
        if(markZNO <= 160){
            System.out.println(nameOfPerson + " have a little mark of ZNO ");
            return;
        }else{
            System.out.println(nameOfPerson + " go to exams ");
            System.out.println(". . .");
            enroll(nameOfPerson, surnameOfPerson);
            return;
        }
    }

    public static void enroll(String nameOfPerson, String surnameOfPerson) {
        Exams exams = new Exams();

        boolean offset = exams.exam(nameOfPerson);

        if (offset == true) {
            System.out.println(nameOfPerson + surnameOfPerson + " credited for faculty " + name);
        }else{
            System.out.println(nameOfPerson + surnameOfPerson + " did not passed exam");
        }
    }
}