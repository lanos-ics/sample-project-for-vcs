import java.util.Scanner;

public class Arraylearning {
    public static void main(String[] args) {

        // declaration and initialisation; (the old way)
        Scanner sc = new Scanner(System.in);
        int [] ages = {0,0,0,0,0};

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter the value " + i + " : ");
            ages[i] = sc.nextInt();
        }

        // access single value from an array:
//        System.out.println(ages[0]);
        // access all values from an array:
//        for(int index = 0; index < ages.length ; index++)
//        {
//            System.out.println(ages[index]);
//        }
        // other way to access all elements from array (for each loop)
        for(int value : ages)
        {
            System.out.println(value);
        }

    }
}
