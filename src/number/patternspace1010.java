package number;
/*
Enter the number
5
        1 
      0 1 0 
    1 0 1 0 1 
  0 1 0 1 0 1 0 
1 0 1 0 1 0 1 0 1 

*/
import java.util.Scanner;

public class patternspace1010 {

	public static void main(String[] args) {
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println();
		}sc.close();
	}
}
