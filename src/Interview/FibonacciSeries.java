package Interview;

public class FibonacciSeries {

	public static void main(String[] args) {
		int x,y=0,z=1;
		System.out.print(y);
		for (int i = 0; i < 10; i++) {
			System.out.print(" "+z );
			x=y;
			y=z;
			z=x+y;
					
		}

	}

}
