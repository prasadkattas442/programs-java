package Interview;

public class ArmstrongNum {
    public static void main(String[] args) {
       // int num = 153;
    	int num = 454;
        int temp = num;
        int arm = 0;
        while (num > 0) {
            int n = num % 10;
           // arm = arm + (n * n * n);
            arm = (arm * 10)  +n;          
            num/= 10;
        }
        if (arm == temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
