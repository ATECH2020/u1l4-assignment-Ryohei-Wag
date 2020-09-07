import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        System.out.print("Enter minutes: ");
        int number = scanner.nextInt();

        //Your code goes here
        final int HOUR = 3600;
        final int MIN = 60;
        //System.out.println(number);
        int hour = number / HOUR;
        int min = number / MIN;
        System.out.print(hour + "  ");
        System.out.println(min);

        // closing the scanner object
        scanner.close();
    }
}