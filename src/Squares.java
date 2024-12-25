import java.util.Scanner;
import java.lang.Math;

public class Squares {
    public static void main(String[] args) {
        // i want to find out the squares of all numbers from sp to ending point;

        Scanner input = new Scanner(System.in);

        double sp = 1 , ep = 10;
        double sq;
        while(sp <= ep)
        {
            sq = Math.pow(sp, 2);
            System.out.println(sq); // square of sp.
            sp++;
        }
        System.out.println("Ended!!");
    }
}
