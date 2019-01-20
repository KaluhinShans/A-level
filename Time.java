class Time {
    public static void main(String[] args) {
        int counter = 0; //счетчик симетричного времеи

        for (int i = 23; i >= 0; i--) {     //начинаем с конца дня
            for (int j = 59; j >= 0; j--) {

                int[] argsHours = division(i);  //делим час на 2 цифры
                int[] argsMinutes = division(j);  //делим минуты на 2 цифры

                //если первая цифра часа равна второй цифре минуты и наооборот, то это симетрия.
                if (argsHours[1] == argsMinutes[0] && argsHours[0] == argsMinutes[1]) {
                    counter++;
                }
            }
        }
        System.out.println("В день, время симетрично: " + counter + " раз");
    }

    //деление чисел на две цифры
    public static int[] division(int time) {

        int a = (time / 10) % 10;
        int b = (time % 10);

        return new int[]{a, b};
    }
}
