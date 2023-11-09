package Java8ToJava17.InstanceOfPatternMatching;

public class InstanceOfPatternMatching {

        public static void main(String[] args) {
            Object obj = "Hello, instanceof pattern matching!";

            if (obj instanceof String s) {
                System.out.println("Longueur de la chaîne : " + s.length());
            } else {
                System.out.println("L'objet n'est pas une chaîne.");
            }
        }

}
