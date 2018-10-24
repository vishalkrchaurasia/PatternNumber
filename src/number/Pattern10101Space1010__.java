package number;
/*
Enter thhe number
5
  1 0 1 0 1 
    1 0 1 0 
      1 0 1 
        1 0 
          1 

*/
import java.util.Scanner;

public class Pattern10101Space1010__ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thhe number");
		int n=sc.nextInt();
		int st=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(j%2+" ");
			}st--;
			System.out.println();
		}sc.close();
	}
}
