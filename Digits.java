import java.util.Scanner;

public class Digits{
	public static void main(String args[])throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int huns;
		int tens;
		int ones;
		
		System.out.print("Enter a 3- digit number : ");
		num1= scan.nextInt();
		
		ones = num1%10;
		num1 = num1/10;
		tens = num1%10;
		num1 = num1/10;
		huns = num1;
		
		System.out.println("the hundredth digit is : "+huns);
		System.out.println("the tens digit is : "+tens);
		System.out.println("the ones digit is : "+ones);
		
		
	}
}