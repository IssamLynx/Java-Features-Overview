import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Définition d'une fonction qui double un nombre entier
        Function<Integer, Integer> doubler = x -> x * 2;

        // Utilisation de la fonction
        int result = doubler.apply(5); // Le résultat sera 10
        System.out.println(result);
    }
}
