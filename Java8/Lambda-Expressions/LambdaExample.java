public class LambdaExample {
    public static void main(String[] args) {

        Cat cat = (String name) -> "Meow Meow, my name is: " + name + "!";
        System.out.println(cat.meow("Kitty"));
       }
    }

