import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sp, ep, number, table;

        System.out.print("Enter the startin point of the table");
        sp = input.nextInt(); // 1 // initialisation

        System.out.print("Enter the ending point of the table");
        ep = input.nextInt(); // 5

        System.out.print("Enter the number to see its table:");
        number = input.nextInt(); // 5

        while(sp <= ep)
        {
            table = number * sp; // calculations
            System.out.println(number + " X " + sp + " = " + table);
            sp++;
        }

    }
}
