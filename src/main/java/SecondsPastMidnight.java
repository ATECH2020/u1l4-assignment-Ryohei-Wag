import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        //System.out.print("Enter seconds: ");
        int number = scanner.nextInt();
        //System.out.println(number);
        int hour = number / 3600;
        int min = number / 60;
        System.out.print(hour + " " + min);

        // closing the scanner object
        scanner.close();
    }
}