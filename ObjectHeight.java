import java.util.Scanner;

public class ObjectHeight{
	public static void main(String args[])throws Exception{
		
		Scanner scan = new Scanner(System.in);
		
		float t;
		float ans;
		
		System.out.print("Enter a time less than 4.5 seconds : ");
		 t =scan.nextFloat();
		System.out.println("");
		Thread.sleep(3000);
		
		ans = (float)(100- 4.9*t*t);
		System.out.print("The height of the object is : "+ans);
		
		
	}
}