import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int calcSec = calc(hours2, minutes2, seconds2) -
                    calc(hours1, minutes1, seconds1);
        System.out.println(calcSec);
        // closing the scanner object
        scanner.close();
    }
    public static int calc(int h, int m, int s)
    {
        return h * 3600 + m * 60 + s;
    }
}