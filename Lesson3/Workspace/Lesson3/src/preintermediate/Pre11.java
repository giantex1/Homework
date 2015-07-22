package preintermediate;

public class Pre11 {
	public static void main(String[] args) 
	{
		int array[]={4,6,0,1,2,3,1,9};
		boolean res=false;
		for(int i=0;i<array.length;i++)
		{
			if (array[i]==1 && array[i+1]==2 && array[i+2]==3)
			{
				res=true;
			}
			if (i+2==array.length-1)
			{
				break;
			}
		}
		System.out.println(res);
	}
}
