package number;
/*
 Enter the number
5
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0  
  
 */
import java.util.Scanner;

public class Pattern_010101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
