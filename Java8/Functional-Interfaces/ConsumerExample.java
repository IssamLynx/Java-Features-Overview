import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Définition d'un consommateur qui affiche un message
        Consumer<String> messageConsumer = message -> System.out.println("Message : " + message);

        // Utilisation du consommateur
        messageConsumer.accept("Bonjour, Java !");
    }
}
