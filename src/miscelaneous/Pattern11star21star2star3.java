package miscelaneous;
/*
Enter the number
6
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
1*2*3*4*5*6

*/
import java.util.Scanner;

public class Pattern11star21star2star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				if(i>j)
					System.out.print("*");
				
			}
			System.out.println();
		}sc.close();
	}
}
