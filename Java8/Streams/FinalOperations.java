import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FinalOperations {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Issam", "Djamal","Karim", "Massi", "El hadji","Abdelmalek","Farid");

        //allMatch(predicate)
        boolean allMatch = names.stream().allMatch(x -> x.length() > 5);
        System.out.println("All Match: " + allMatch);

        //anyMatch(predicate)
        boolean anyMatch = names.stream().anyMatch(x -> x.length() > 5);
        System.out.println("Any Match: " + anyMatch);

        //noneMatch(predicate)
        boolean noneMatch = names.stream().noneMatch(x -> x.length() > 5);
        System.out.println("None Match: " + noneMatch);

        //collect(collector)
        String collect = names.stream().collect(Collectors.joining(","));

        // forEach with parallelStream
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );
    }
}
