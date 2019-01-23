import java.util.Random;

public class BingoCard{
	public static void main(String args[]){
		Random rand = new Random();
		
		int [][]arr = new int[5][5];
		
		System.out.printf("B	I 	N 	G 	O");
		
		
		//make a 2d matrix
		int m=1;
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				
			if(i==2 &&j==2){
				arr[j][i]=0;
			}else{
				arr[j][i]= rand.nextInt(15)+m;
			}

			}
			m=m+15;
		}
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(arr[i][j]+"	");
			}
			System.out.print("\n");
		}
		
		
	}
}