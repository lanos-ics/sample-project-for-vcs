import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number, digit, reverse = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to reverse the number");

        System.out.print("Enter the number: ");
        number = sc.nextInt(); // 123 (initialisation)

        while(number != 0) // condition 1 != 0 = true
        {
            digit = number % 10; // remainder ( 1 % 10 = 1)
            number = number / 10; // update statement (1 / 10 = 0)

            reverse = reverse * 10 + digit; // (32 * 10 + 1 = 321)
        }
        System.out.println(reverse);
    }
}
