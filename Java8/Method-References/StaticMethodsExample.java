interface MathOperation {
    int operate(int a, int b);
}
public class StaticMethodsExample {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        MathOperation addition= StaticMethodsExample::add;
        int result = addition.operate(5,3);
        System.out.println("Result: " + result);
    }

}
