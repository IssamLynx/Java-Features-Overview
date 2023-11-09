package Java8ToJava17.SealedClasses;

public class Zoo {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        if (dog instanceof Dog d) {
            System.out.println(d.woof());
        }
        else if (cat instanceof Cat c) {
            System.out.println(c.meow());
        }

    }
}
