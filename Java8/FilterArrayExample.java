import java.util.Arrays;
import java.util.stream.IntStream;

public class FilterArrayExample {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 10, 13, 17};

        // Filter even numbers
        int[] evenNumbers = Arrays.stream(numbers)
                                  .filter(n -> n % 2 == 0)
                                  .toArray();

        System.out.println("Even Numbers: " + Arrays.toString(evenNumbers));
    }
}
