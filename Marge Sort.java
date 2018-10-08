class Main {
    public static void main(String[] args) {
        int[] mass = {6, 5, 3, 1, 8, 7, 2, 4};

        System.out.println("Начальный: ");
        for (int i = 0; i < mass.length; i++) {  //вывод начального массива
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");

        split(mass); //отправляем на нарезку

        System.out.println("Конечный: ");
        for (int i = 0; i < mass.length; i++) {  //вывод финального массива
            System.out.print(mass[i] + " ");
        }
    }

    public static void split(int a[]) {
        int middle = a.length / 2;    //делим массив на два

        int[] first = new int[middle];  //первая часть массива
        int[] second = new int[middle];  //вторая часть массива

        for (int i = 0; i < middle; i++) {  //заполняем массивы
            first[i] = a[i];
            second[i] = a[i + middle];
        }

        int middle1 = first.length / 2; //делим два массива по два

        int[] first1 = new int[middle1];  //первая часть первого массива
        int[] first2 = new int[middle1];  //вторая часть первого массива
        int[] second1 = new int[middle1]; //первая часть второго массива
        int[] second2 = new int[middle1]; //вторая часть второго массива


        for (int i = 0; i < middle1; i++) { //заполняем массивы
            first1[i] = first[i];
            first2[i] = first[i + middle1];
            second1[i] = second[i];
            second2[i] = second[i + middle1];
        }
        iziSort(first1, first2, first);    //отправляем маленькие
        iziSort(second1, second2, second); //части на простую сортировку
        margeSort(first, second, a);    //отправляем отсортированные большие части на слияние
    }

    public static void iziSort(int[] littleArr1, int[] littleArr2, int[] bigArr) {

        for (int i = 0; i < littleArr1.length - 1; i++) {  //сортируем маленькие части
            if (littleArr1[i] > littleArr1[i + 1]) {
                int t = littleArr1[i];
                littleArr1[i] = littleArr1[i + 1];
                littleArr1[++i] = t;
            }
        }
        for (int i = 0; i < littleArr2.length - 1; i++) {  //тут тоже
            if (littleArr2[i] > littleArr2[i + 1]) {
                int t = littleArr2[i];
                littleArr2[i] = littleArr2[i + 1];
                littleArr2[++i] = t;
            }
        }

        margeSort(littleArr1, littleArr2, bigArr);  //сливаем маленькие в большие
    }

    public static void margeSort(int[] first, int[] second, int a[]) {

        int counterF = 0;  //индекс первого массива
        int counterS = 0;  //индекс второго массива

        for (int i = 0; i < a.length; i++) {

            if (counterF > first.length - 1) {  //если индекс первого привысел длинну первого массива то зполняем оставшееся вторым массивом
                a[i] = second[counterS++];
            } else if (counterS > second.length - 1) {  //если индекс второго привысел длинну второго массива то зполняем оставшееся первым массивом
                a[i] = first[counterF++];
            } else if (first[counterF] < second[counterS]) {
                a[i] = first[counterF++];
            } else {
                a[i] = second[counterS++];
            }
        }
    }
}