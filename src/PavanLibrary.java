import java.util.ArrayList;

public class PavanLibrary {

    // area :
    public void area(double length, double breadth){
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


}
