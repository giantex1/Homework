package beginner;

public class B8 {
	public static String yourMethod(String a, int n)
	{
		String a1=a;
		for (int i=0;i<n;i++)
		{
			a1=a1+a.substring(0,n-i);
		}
		return a1;
	}
	public static void main(String[] args)
	{
		String a="Summer";
		int n=4;
		System.out.println(yourMethod(a,n));	
	}
}
