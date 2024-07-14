package Interview;

public class SwapStrings {
    public static void main(String[] args) {
        String a = "Java", b = "Program";
        System.out.println("Before Swap : " + a + " " + b);
        a = a + b;//JavaProgram
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After Swap : " + a + " " + b);
    }
}
