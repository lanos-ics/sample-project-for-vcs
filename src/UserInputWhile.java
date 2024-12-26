import java.util.Scanner;

public class UserInputWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput = "";

        do
        {
            if(userInput.isEmpty())
            {
                System.out.print(
                                """
                                Enter from the following: 
                                (yes to print |
                                no to exit ):
                                """);
                userInput = sc.nextLine();
                userInput = userInput.toLowerCase();
            }
            else {
                System.out.println("Do you want to continue ?: (yes to continue | no to exit ):");
                userInput = sc.nextLine();
                userInput = userInput.toLowerCase();
            }

           switch(userInput)
           {
               case "yes":
                   System.out.println("hii!");
                    break;
               case "no":
                   System.out.println("thanks for using our program!");
                   break;
               default:
                   System.out.println("invalid input! please try again!");
           }

        }while(!userInput.equals("no"));

        System.out.println("Ended!!");


    }

}
