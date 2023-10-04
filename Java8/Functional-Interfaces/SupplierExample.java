import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Définition d'un fournisseur qui renvoie un nombre aléatoire
        Supplier<Double> randomSupplier = () -> Math.random();

        // Utilisation du fournisseur
        double randomValue = randomSupplier.get();
        System.out.println("Nombre aléatoire : " + randomValue);
    }
}
