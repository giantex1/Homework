package intermediate;

public class Inter6 {
	public static void main (String[] args)
	{
		String s="Some After new";
		String[] wordsArray=s.split(" ");
		int maxsize=0;
		String maxWord="";
		for(int i=0;i<wordsArray.length;i++)
		  {
		  if(wordsArray[i].length()>maxsize)
		     {
		     maxWord=wordsArray[i];
		     maxsize=wordsArray[i].length();
		     }
	      }
		System.out.println(maxWord);
	}	
}
