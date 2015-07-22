package preintermediate;

public class Pre12 {
	public static void main(String[] args) 
	{
		int number=22345;
		int res=0;
		String str =Integer.toString(number);
		for (int i=0;i<str.length();i++)
		{
			char a =str.charAt(i);
			int i1 = Character.getNumericValue(a);
			res=res+i1;
		}
		System.out.println(res);
	}
}
