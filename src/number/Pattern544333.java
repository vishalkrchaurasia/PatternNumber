package number;
/*Enter the number 5

5
44
333
2222
11111
*/
import java.util.Scanner;

public class Pattern544333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n-i+1);
			}
			System.out.println();
		}sc.close();
	}
}
