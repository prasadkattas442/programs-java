package Interview;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345, sum = 0;
        while (num > 0) {
            int n = num % 10;
            sum = sum + n; //sum+= n;
            num/=10;
        }
        System.out.println(sum);
    }
}
