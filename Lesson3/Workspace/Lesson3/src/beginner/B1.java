package beginner;

public class B1 {
	public static void main(String[] args) {
		//Array of integer numbers
		int array[] = {2 , 4 , 6};
		for (int i=0 ; i<array.length ; i++)
		{
			array[i] = array[i]*3;
			System.out.println(array[i]);
		}	
	}
}
