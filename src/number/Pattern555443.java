package number;
/*Enter the number 5

55555
4444
333
22
1
*/
import java.util.Scanner;

public class Pattern555443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}sc.close();
	}
}
