package intermediate;
import java.util.Scanner;
public class Inter4 {
	public static boolean isValidNumber(String str)
	{
		int count=0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isDigit(str.charAt(i)))
			    {
		           count++;
		        }
		}
		if(count>0)
			{
			return true;
			}
		else
		{
			return false;
		}
	}
	public static void main (String[] args)
	{
	    Scanner in =new Scanner (System.in);
	    System.out.print("Enter text with numbers: ");
	    String str = in.nextLine();
	    int a;
	    int number = 0;
	    int result=0;
	    if (isValidNumber(str)==true)
	    {
	    for (int i = 0; i < str.length(); i++) 
	    {
	         if (Character.isDigit(str.charAt(i))){
	         number = Integer.valueOf(str.substring(i, i+1)).intValue();
	         a=number;
	         result=result+a;
	        }
        }
	    System.out.println(result);
	    }
	    else System.out.println("No numbers");
	}
}
