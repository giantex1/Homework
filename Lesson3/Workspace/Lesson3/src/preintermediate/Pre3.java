package preintermediate;
public class Pre3 {
	public static boolean myMethod(int a, int b)
	{
		boolean res=false;
		if (a ==21 || b==21 || a+b==21 )
		{
			res = true;
		}	
		return res;
	}
	public static void main(String[] args) 
	{
			System.out.println(myMethod(11,11));	
}
}
