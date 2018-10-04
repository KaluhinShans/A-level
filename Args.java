class Args {
    public static void main(String[] args) {
        int[] mass = {1, 4, 5, 1, 1, 3};
        int counter = found(mass);
        System.out.println("Здесь " + counter + " различных цифр");
    }
    public static int found(int[] mass) {
        int counter = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] != mass[i + 1]) {
                counter++;
            }
        }
        return counter;
    }
} 