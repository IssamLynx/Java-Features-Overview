//Instance method of arbitrary object of a particular type

import java.util.Arrays;
import java.util.List;

public class InstanceMethodArbitraryObject {

    public static void main(String[] args) {
    List<Person> people = Arrays.asList(
            new Person("Issam"),
        new Person("Sara"),
        new Person("Ali"),
        new Person("John")
            );
        people.forEach(Person::disBonjour);
    }

}
