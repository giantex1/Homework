package preintermediate;

public class Pre2 {
	public static String swapChar(String a)
	{
		char first;
		char last;
		first=a.charAt(0);
		last=a.charAt(a.length()-1);
		String str1 =""+first;
		String str2 =""+last;
		String res = str2 + a.substring(1,(a.length()-1))+str1;
		return res;
	}
	public static void main(String[] args)
	{
		String a="Zoom";
		System.out.println(swapChar(a));	
	}
}

