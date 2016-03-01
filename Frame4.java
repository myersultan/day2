package day2.frame4;

public class Frame4 {

    public static void main(String[] args) {
        printTankInfo();
    }

    private static void printTankInfo() {
        Tank t = new Tank();
        System.out.println("Tank color: " + t.color + "\ncrew: " + t.crew + "\nmaxSpeed: " + t.maxSpeed);

    }
}
