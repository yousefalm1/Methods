import java.util.ArrayList;

public class SummationPractice {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);

        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
