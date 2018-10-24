package number;
/*
Enter the number
5
0
11
000
1111
00000

*/
import java.util.Scanner;

public class Pattern011000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i+1)%2);
			}
			System.out.println();
		}sc.close();
	}
}
