public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String sayHello(String name) {
         return "Hello my name is: " + name;
    }

    public void disBonjour() {
         System.out.println("Bonjour, je m'appelle: " + name);
    }

}