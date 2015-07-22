package advanced;

public class Adv2 {
	public static String toRoman(int num) {
		        String Roman = ""; //      This will be our result string.
		        //    Declare and Initiate our Arrays
		        String onesArray[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		        String tensArray[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		        String hundredsArray[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		        //    Get the ones in the number
		        int ones = num % 10;
		        //    Get the tens
		        num = (num - ones) / 10;
		        int tens = num % 10;
		        //    Get the hundreds
		        num = (num - tens) / 10;
		        int hundreds = num % 10;
		        //    Get and write the thousands in the number to our string
		        num = (num - hundreds) / 10;
		        for (int i = 0; i < num; i++) {
		            Roman += "M";
		        }
		        //    Write the hundreds
		        if (hundreds >= 1) {
		            Roman += hundredsArray[hundreds - 1];
		        }
		        //    Write the tens
		        if (tens >= 1) {
		            Roman += tensArray[tens - 1];
		        }
		        //    And finally, write the ones
		        if (ones >= 1) {
		            Roman += onesArray[ones - 1];
		        }
		        //    Return our string.
		        return String.valueOf(Roman);
}
	public static void main(String[] args) 
	{
		int num =2015;
		System.out.println(toRoman(num));
}
}