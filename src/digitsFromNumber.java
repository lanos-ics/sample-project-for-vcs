import java.util.Scanner;

public class digitsFromNumber {
    public static void main(String[] args) {
        // taking out all the digits from a number:
        int number, digit;
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to take out the digits from a number");

        System.out.print("Enter the number: ");
        number = sc.nextInt(); // 4785 (initialisation)

        while(number != 0) // condition
        {
            digit = number % 10; // remainder
            number = number / 10; // update statement
            System.out.println(digit);
        }



    }
}
