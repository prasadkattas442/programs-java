package Interview;

public class SwapIntegers {
    public static void main(String[] args) {
        int a = 10, c = 100, b = 20, d = 200;
        System.out.println("Before Swap : " + a + " " + b);
        a = a + b;//30
        b = a - b;//10
        a = a - b;//20
        System.out.println("After Swap : " + a + " " + b);
        System.out.println("Before Swap : " + c + " " + d);
        c = c * d;//20000
        d = c / d;//200
        c = c / d;//100
        System.out.println("After Swap : " + c + " " + d);
    }
}
