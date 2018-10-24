package number;
/*
Enter the number
5
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

*/
import java.util.Scanner;

public class patternSpace1SpaceSpace010__bys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sp=n-1,ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
				
			}
			int k=1;
			for(int j=1;j<=ele;j++)
			{
			
				System.out.print(k+" ");
				if(j<i)
					k++;
				else
					k--;
			}
			sp--;
			ele=ele+2;
			System.out.println();
		}sc.close();
	}
}
