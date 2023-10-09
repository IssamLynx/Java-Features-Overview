import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2,2, 3, 4,99,105);

        //filter(predicate)
        List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        String evenNumbersAsString = numbers.stream().filter(x -> x % 2 == 0).map(x -> x.toString()).collect(Collectors.joining(","));
        System.out.println("Even Numbers : " + evenNumbers);

        //map(function)
        List<Integer> doubleNumbers = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println("Double Numbers: " + doubleNumbers);

        //flatMap(function)
        List<Integer> flatMapNumbers = numbers.stream().flatMap(x -> Arrays.asList(x, x * 2).stream()).collect(Collectors.toList());
        System.out.println("FlatMap Numbers: " + flatMapNumbers);

        //distinct()
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Numbers: " + distinctNumbers);

        //sorted()
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);

        //peek()
        List<Integer> peekNumbers = numbers.stream().filter(x -> x % 2 == 0).peek(f -> System.out.println("Result of filter"+ f)).map(x -> x * 2).peek(m -> System.out.println("Result of map: " + m)).collect(Collectors.toList());
        System.out.println("Peek Numbers: " + peekNumbers);

        //limit()
        List<Integer> limitNumbers = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limit Numbers: " + limitNumbers);

        //skip()
        List<Integer> skipNumbers = numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println("Skip Numbers: " + skipNumbers);

    }
}
