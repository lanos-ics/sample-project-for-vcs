import java.util.ArrayList;
import java.util.Scanner;

public class learningMethodCreation {
    public static void main(String[] args) {

        // area: mobile (len: 6, brd: 4)(inch): design: area sqinch
        Scanner input = new Scanner(System.in);
        PavanLibrary pl = new PavanLibrary();
        double len, brd;

        System.out.println("Enter the length of mobile in inches: ");
        len = input.nextDouble();

        System.out.println("Enter the breadth of mobile in inches: ");
        brd = input.nextDouble();

        pl.area(12, 14);

        System.out.println("area of mobile is: " + area + " sqinch.");



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

