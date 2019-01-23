import java.util.Scanner;

public class PizzaCost{
	public static void main(String args[])throws Exception{
		
		Scanner scan = new Scanner(System.in);
		float dia;
		float price;
		
		
		System.out.print("Enter the diameter of pizza in inches : ");
		dia = scan.nextFloat();
		
		price = (float)(0.05*dia*dia + 0.75+1.0);
		
		System.out.print("the price of pizza is : $"+price);
	}
}