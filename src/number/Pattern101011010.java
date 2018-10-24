package number;
/*
Enter the number
5
10101
1010
101
10
1

*/
import java.util.Scanner;

public class Pattern101011010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}sc.close();
	}
}
