package advanced;
import java.util.Random;
public class Adv1 {
	public static void main(String[] args) 
	{
	    String charset = "0123456789abcdefghijklmnopqrstuvwxyz";
	    String charset1 = "ABCDEFGHIJKLMN";
	    int length=15;
		    Random rand = new Random();
		    StringBuilder sb = new StringBuilder();
		    for (int i = 1; i < length; i++) {
		        int pos = rand.nextInt(charset.length());
		        sb.append(charset.charAt(pos));
		    }
		    int pos = rand.nextInt(charset1.length());
		    sb.append(charset1.charAt(pos));
		    String result=sb.toString();
		    System.out.println(result);
	}
}
