package preintermediate;

public class Pre1 {
	public static boolean visitCinema(boolean a, boolean b)
	{
		boolean res=a == b;
		return res;
	}
	public static void main(String[] args)
	{
		boolean heSmile=false;
		boolean sheSmile=false;
		System.out.println(visitCinema(heSmile,sheSmile));	
	}
}
