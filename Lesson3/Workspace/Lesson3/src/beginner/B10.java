package beginner;

public class B10 {
	public static void main(String[] args)
	{
		int n=4;
		String a="";
		for (int i=0;i<n;i++)
		{
			a=a+"*";
			System.out.println(a);
		}
		for (int i=1;i<n;i++)
		{
			a=a.substring(0, n-i);
			System.out.println(a);
		}
	}
}
