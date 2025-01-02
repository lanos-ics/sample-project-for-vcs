public class ArrayLearningPractice {
    public static void main(String[] args) {

        // sum of all elements of an array:

        // declaration and initialisation:

        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        // logic:

        for(int number : numbers)
        {
            sum = sum + number;
        }

        // printing:
        System.out.println("the sum of all elements is: " + sum);


    }
}
