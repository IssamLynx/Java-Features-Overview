package Java8ToJava17.Record;

public record Book(String title, String author, int pageCount, double price) {
    // les méthodes equals(), hashCode(), et toString() sont automatiquement générées.
}
