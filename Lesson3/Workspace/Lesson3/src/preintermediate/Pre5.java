package preintermediate;

public class Pre5 {
	public static boolean arrayCheck(int array[])
	{
		boolean res=true;
		int count =0;
		for (int i=0;i<array.length;i++)
		{
			if (array[i]==7 || array[i]==9)
			{
				count++;
			}
		}
		if (count>0)
		{
			res=false;
			return res;
		}
		else return res;
	}
	public static void main(String[] args) {
		//Array of integer numbers
		int array[] = {2 , 4 , 6 , 4 ,2,2,2,7};
			System.out.println(arrayCheck(array));
	}
}
