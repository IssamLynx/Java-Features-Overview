import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        OptionalExample optionalExample = new OptionalExample();
        Optional<String> optional = optionalExample.findByName("Issam");
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("User not found");
        }

        // or we can do it like this ;)
        System.out.println(optional.orElse("User not found"));
    }
    public Optional<String> findByName(String name){
    if(name.equalsIgnoreCase("Issam")){
        return Optional.of("User " + name + " found");
    }else{
        return Optional.empty();
    }
    }
}

