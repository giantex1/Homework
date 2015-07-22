package intermediate;
import java.util.Scanner;

public class Inter5 {
	 private static float k = 0, c = 0;
	    private static final Scanner scan = new Scanner (System.in);
	    private static int converChoice = 1;

	    public static void main(String [] args) {
	        System.out.println("Press 1 for C->K or 2 for K->C");
	        converChoice = scan.nextInt();

	        if (converChoice == 1) 
	            convertCtoKAndPrint();
	        else
	            convertKtoCAndPrint();
	    }

	    public static void convertKtoCAndPrint() {
	        System.out.println("Please enter degrees K");
	        double k = scan.nextDouble();

	        double c = k-273.15;

	        System.out.println(k + " degrees K is " + c + " degrees C.");
	    }

	    public static void convertCtoKAndPrint() {
	        System.out.println("Please enter degrees C");
	        double c = scan.nextDouble();

	        double k = c+273.15;

	        System.out.println(c + " degrees C is " + k + " degrees K.");
	    }
}
