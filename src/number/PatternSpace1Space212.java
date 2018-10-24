package number;
/*
Enter the number
5
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 

*/
import java.util.Scanner;
public class PatternSpace1Space212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int k=i;
			for(int j=1;j<=st;j++)
			{
				System.out.print(k+" ");
				if(j<i)
					k--;
				else
					k++;
			}
			st=st+2;
			System.out.println();
		}sc.close();
	}
}