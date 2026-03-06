
import java.util.ArrayList;
import java.util.List;

interface Condition{
    boolean test (int n);
}

public class demo1 {

    // even(numbers)
    static List<Integer> filter(List<Integer> numbers, Condition condition) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if (condition.test(n)) {
                result.add(n);
            }
        }
        return result;
    }    

    //sum
    static int sum(List<Integer> numbers) {
        int total = 0;
        for (int n : numbers) {
            total = total + n;
        }
        return total;
    }

    // even(numbers)
    static List<Integer> even(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }
        return result;
    }

        static List<Integer> greaterThanTwo(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if (n > 2) {
                result.add(n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int total = 0;
        List<Integer> numbers
                = List.of(1, 2, 3, 4, 5);
        //for (int n : numbers) {
          //  if (n % 2 == 0) {
            //    total = total + n;
            //}
        //}
        //total = sum(greaterThanTwo(even(numbers)));
        //System.out.println(total);

        total = sum(filter(numbers, new Condition() {
            @Override
            public boolean test(int n) {
                return n % 2 == 0;
            }
        })); new Condition() {
            @Override
            public boolean test(int n) {
                return n > 2;
            }
        };

        total = sum(filter(filter(filter(numbers, n -> n % 2 == 0),
            x -> x > 2),
            x -> x< 10));


    }
}
