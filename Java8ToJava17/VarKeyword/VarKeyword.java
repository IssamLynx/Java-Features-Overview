package Java8ToJava17.VarKeyword;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarKeyword {
    public static void main(String[] args) {
        // java 8 way
        Map<Student, List<Student>> myMap = new HashMap<>();
        // java 10 way
        var myMapWithVar = new HashMap<Student, List<Student>>();

    }
}
