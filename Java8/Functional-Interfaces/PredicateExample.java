import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Définition d'un prédicat pour tester si un nombre est pair
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // Utilisation du prédicat
        boolean result = isEven.test(6); // Le résultat sera true
        System.out.println(result);
    }
}
