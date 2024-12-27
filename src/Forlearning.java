import java.util.Scanner;
import java.lang.Math;
public class Forlearning {
    public static void main(String[] args) {

        // for loop is used when we know how many time program is
        // to be repeate:

        int value=1;

        for(;;)
        {
//            System.out.println("square is: " + Math.pow(value, 2));
//            System.out.println("hi");

            if(value == 0 || value == 10 )
            {
                System.out.println("theek hai!");
                break;
            }
            else{
                System.out.println(value);
                value++;
            }


        }



    }
}
