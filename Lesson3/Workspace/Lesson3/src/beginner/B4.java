package beginner;
import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
		int j=0;
		int array[] = {2 , 4 , 6 , 2 , 2 ,5 , 6 , 4 , 8};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to search: ");
		int x = in.nextInt();
		for (int i =0; i<array.length ;i++)
		{
			if (array[i] == x)
			{
				j++;
			}
		}
		System.out.println("The number of digits in the array: " +j);
}
}
