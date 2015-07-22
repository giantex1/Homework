package beginner;
import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter mark: ");
		int mark = in.nextInt();
		switch (mark)
		{
		case 1: System.out.println("Your result is Excellent");
		        break;
		case 2: System.out.println("Your result is Very good");
                break;
		case 3: System.out.println("Your result is Good");
                break;
		case 4: System.out.println("Your result is Satisfactorily");
                break;
		case 5: System.out.println("Your result is Failed");
                break;
		}
}
}
