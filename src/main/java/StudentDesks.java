import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        //System.out.print("# of class A: ");
        int classA = scanner.nextInt();
       // System.out.print("# of class B: ");
        int classB = scanner.nextInt();
        //System.out.print("# of class C: ");
        int classC = scanner.nextInt();
        int total = classA + classB + classC;
        int totalDesk = total / 2;
        if(total % 2 != 0)
        {
          totalDesk++;
        }
        System.out.println(totalDesk);

        // closing the scanner object
        scanner.close();
    }
}