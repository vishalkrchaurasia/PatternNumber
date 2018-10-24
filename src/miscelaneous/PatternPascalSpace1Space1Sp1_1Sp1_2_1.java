package miscelaneous;
/*Enter the Number
5
      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1 
*/
import java.util.Scanner;

public class PatternPascalSpace1Space1Sp1_1Sp1_2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int number=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}sc.close();
	}
}
