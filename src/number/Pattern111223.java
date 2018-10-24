package number;
/*
Enter the number
6
111111
22222
3333
444
55
6

*/
import java.util.Scanner;

public class Pattern111223 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}sc.close();
	}
}
