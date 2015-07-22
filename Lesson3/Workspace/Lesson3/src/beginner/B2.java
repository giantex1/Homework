package beginner;
import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
		boolean res;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = in.nextInt();
		System.out.println("Enter second number: ");
		int y = in.nextInt();
		if (x ==10 || y==10 || x+y==10 ){
			res= true;
			System.out.println(res);
		}		
}
}
