package intermediate;

public class Inter3 {
	public static void main(String[] args) 
	{
		int array[] = {2,4,5,6,2,7,1};
		int j=array.length;
		int array1[]= new int[j];
		for(int i=0;i<array.length;i++)
		{
			array1[j-1]=array[i];
			j--;
		}	
		for(int i1=0;i1<array1.length;i1++)
		{
			System.out.println(array1[i1]);
		}
	}

}