import java.util.Scanner;

public class DivAndMod{
	public static void main(String args[])throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Enter a number : ");
		num1= scan.nextInt();
		System.out.print("Enter the second number : ");
		num2= scan.nextInt();
		
		int ans;
		ans = num1/num2;
		System.out.println(num1+" / "+ num2+" = "+ans);
		ans = num1%num2;
		
		System.out.println(num1+" % "+ num2+" = "+ans);
		ans = num2/num1;
		System.out.println(num2+" / "+ num1+" = "+ans);
		
		ans= num2%num1;
		System.out.println(num2+" % "+ num1+" = "+ans);
		
		
	}
}