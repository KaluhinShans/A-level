class Teacher {

    static String name = "Petrov";
    static String surname = " Noval";

    public static boolean evaluation(int work) {
        System.out.println("Work checked by " + name + surname);
        System.out.println(". . .");
        boolean mark;

        if(work < 50) {
            mark = false;
        }else{
            mark = true;
        }

        return mark;
    }

}