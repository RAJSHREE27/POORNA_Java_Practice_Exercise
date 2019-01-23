import java.util.Scanner;

public class Change{
	public static void main(String args[])throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int cents;
		int quarters;
		int dimes;
		int Nickels;
		int pennies;
		
		
		System.out.print("Enter the cents in change : ");
		cents = scan.nextInt();
		
		quarters = cents/25;
		cents=cents%25;
		dimes = cents/10;
		cents = cents%10;
		Nickels = cents/5;
		cents=cents%5;
		pennies = cents;
		
		System.out.println("the minimum number of coins are : ");
		System.out.println("Quarters : " + quarters);
		System.out.println("Dimes : "+ dimes);
		System.out.println("Nickels : "+ Nickels);
		System.out.println("Pennies : "+pennies);
		
	}
}