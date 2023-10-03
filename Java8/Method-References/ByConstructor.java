public class ByConstructor {
    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("Issam");
        System.out.println(person.sayHello("Issam"));
    }
}
