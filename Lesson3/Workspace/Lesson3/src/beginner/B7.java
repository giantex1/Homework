package beginner;

public class B7 {
	public static void main(String[] args)
	{
		int max;
		int array[] = {5,6,2,3,10,5,4,11};
		max=array[1];
		for (int i=0 ; i<array.length ;i++)
		{
			if (array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("Largest number is: " +max);
	}

}
