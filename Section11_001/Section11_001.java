package Section11_001;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Section11_001 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0,1,10,22,13,34,5,6,7,8,9,10,11,12,13,14,15);
        int sum = 0;
        for (Integer number : numbers) {
            Predicate<List<Integer>> isEven = num -> number % 2 == 0;
            if (isEven.test(numbers)){
                System.out.println(number);
                sum += number;
            }
        }
        System.out.printf("Tong cua cac so chan trong list la %d : ",sum);
    }
}
