import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayTheNewWay {

    public static void main(String[] args) {
        // dynamic array:
//        ArrayList<Integer> numbers = new ArrayList<>(); // mutable
//
//        // length:
//        System.out.println(numbers.size());
//        numbers.add(12);
//        numbers.add(13);
//        numbers.add(14);
//        numbers.add(15);
//
//        System.out.println(numbers);
//        numbers.remove(2);
//        System.out.println(numbers);
//        numbers.set(2, 144);
//        System.out.println(numbers);
//        boolean res = numbers.isEmpty();
//        System.out.println(res); // true/ false
//
//        numbers.clear();
//        System.out.println(numbers);

        // program:

        ArrayList<String> names = new ArrayList<>();// java 8
        ArrayList<String> capNames = new ArrayList<>();
          names.add("sarita");
        names.add("ravi");
        names.add("kumar");
        names.add("rohini");
        names.add("ramesh");
        names.add("vikash");
        names.add("rohit");
        names.add("rupesh");
        names.add("kavita");
        names.add("kalindi");
        names.add("punam");


        // logic:
        for(String name: names)
        {
             capNames.add(name.concat(" ji"));
        }

        System.out.println(names);
        System.out.println(capNames);


    }

}
