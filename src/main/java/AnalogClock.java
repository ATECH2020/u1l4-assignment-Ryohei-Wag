import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        //System.out.print("Enter angle: ");
        int angle = scanner.nextInt();
        int hour = angle / 30;
        int min = (angle % 60) * 2;
        //System.out.println(hour + ":" + min);
        int minAngle = min * 6;
        System.out.print(minAngle);
        //System.out.println("(" + min + ")");
        // closing the scanner object
        scanner.close();
    }
}