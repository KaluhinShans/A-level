public class Main {

    public static void main(String[] args) {
        int[][] triangle = new int[5][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = 0;
            }

        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/* Запускаем код и видим что на 24 строчке выдает ошибку. Ставим на строчке точку остановки жука, и
        видим что i и j = 0(пока все нормально). Нажимаем два раза конпку "Next Line" и видим что переменная j
        привысила размер массива. Идем проверять условие цикла и находим что у переменной j нету условия
        остановки массива, вместо него стоит условие для i. Меняем переменную i на j, удаляем лишнии строчки и радуемся) */