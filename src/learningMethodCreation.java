import java.util.ArrayList;
import java.util.Scanner;

public class learningMethodCreation {

    // method: calculates area:
    public static void area(double length, double breadth){
        // calculate area:
        double area = length * breadth;
        System.out.println("area is : " + area);
    }

    public static int power(int value, int pow)// value : 2 | pow: 3
    {
        ArrayList<Integer> values = new ArrayList<>();
        int result = 1;

        for(int i = 0; i < pow; i++)
        {
            values.add(value); // jitni value pow ki hai
        }

        // logic:
        for(int num : values)
        {
            result = result * num; //  4*2 = 8
        }
        return result ;
    }

    public static void main(String[] args) {

        // area: mobile (len: 6, brd: 4)(inch): design: area sqinch
//        Scanner input = new Scanner(System.in);
//        double len, brd;
//
//        System.out.println("Enter the length of mobile in inches: ");
//        len = input.nextDouble();
//
//        System.out.println("Enter the breadth of mobile in inches: ");
//        brd = input.nextDouble();
//
//        area(len, brd);

//        System.out.println("area of mobile is: " + area + " sqinch.");



        // area: jameen: (len: 45 , brd: 55)(ft.): design: and: area in SQFT

//        System.out.println("Enter the length of jameen in ft: ");
//        len = input.nextDouble();
//
//        System.out.println("Enter the breadth of jameen in ft: ");
//        brd = input.nextDouble();
//
//        area(len, brd);

//        System.out.println("area of jameen is: " + area + " SQFT.");



//        System.out.println(power(4, 3)); //
//        System.out.println(power(12, 3)); //


    }



}

