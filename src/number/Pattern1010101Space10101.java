package number;
/*Enter the number
5
  1 0 1 0 1 0 1 0 1 
    1 0 1 0 1 0 1 
      1 0 1 0 1 
        1 0 1 
          1 
*/
import java.util.Scanner;
public class Pattern1010101Space10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int st=2*n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(j%2+" ");
			}
			st=st-2;
			System.out.println();
		}sc.close();
	}
}