package Interview;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 6; i > 0 ; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
