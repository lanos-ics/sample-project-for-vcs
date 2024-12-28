import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int number,digit,temp;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();

        temp = number;
        while(number != 0)
        {
            digit = number % 10;
            number = number / 10;

            sum = sum + (digit*digit*digit);
        }

        System.out.println("sum is: " + sum);
        System.out.println("number is: " + temp);

        if(temp == sum)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println(" not Armstrong");

        }


    }

}
