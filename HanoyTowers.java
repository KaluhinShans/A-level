import java.util.Scanner;

public class HanoyTowers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("give me number of disks");
        int n = scan.nextInt();

        String firstTower = "tower 1";
        String secondTower = "tower 2";
        String thirdTower = "tower 3";

        moveTower(n, firstTower, secondTower, thirdTower);

    }

    private static void move(String diskFrom, String diskTo) {
        System.out.println("Move disk from " + diskFrom + " to " + diskTo);
    }

    private static void moveTower(int countDisk, String tower1, String tower2, String tower3) {

        if (countDisk == 0) return;
        moveTower(countDisk - 1, tower1, tower3, tower2);
        move(tower1, tower2);
        moveTower(countDisk - 1, tower3, tower2, tower1);
    }
}