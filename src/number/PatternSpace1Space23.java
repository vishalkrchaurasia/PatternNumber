package number;
/*
Enter the number
5
        1 
      2 3 
    4 5 6 
  7 8 9 1 
2 3 4 5 6 

*/
import java.util.Scanner;

public class PatternSpace1Space23 {

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
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
				if(k==10)
					k=1;
			}
			System.out.println();
		}sc.close();
	}
}
