import java.util.Scanner;

public class LearningWhileLoop {
    public static void main(String[] args) {

        // printing the counting until the user want:

        Scanner input = new Scanner(System.in);

        // declaration of variable
        int sp, ep;


        // user se input

        System.out.println("Enter the startin point of the counting");
        sp = input.nextInt(); // 1 // initialisation
        System.out.println("Enter the ending point of the counting");
        ep = input.nextInt(); // 5
        // logic and output:
        while(sp <= ep) // 6 <= 5 (false)
        {
            System.out.println(sp); // 1 | 2 | 3 | 4 | 5 |endless|
            sp++; // 6
        }

        System.out.println("program ended!");


    }

}
