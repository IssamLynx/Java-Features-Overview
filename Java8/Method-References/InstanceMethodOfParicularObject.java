interface Greeting {
    String greet(String name);
}


public class InstanceMethodOfParicularObject {
    public static void main(String[] args) {
    Greeting greeting= new Person()::sayHello;
    System.out.println(greeting.greet("Issam"));
}}
