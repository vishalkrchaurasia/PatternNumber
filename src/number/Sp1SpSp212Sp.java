package number;
/*Enter the number
7
      1 
    2 1 2 
  3 2 1 2 3 
4 3 2 1 2 3 4 
  3 2 1 2 3 
    2 1 2 
      1 
*/
import java.util.Scanner;
public class Sp1SpSp212Sp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sp=n/2,ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int k=ele/2+1;
			for(int j=1;j<=ele;j++)
			{
				System.out.print(k+" ");
				if(j<=ele/2)
					k--;
				else
					k++;
			}
			if(i<=n/2)
			{
			sp--;
			ele=ele+2;
			}
			else{
				sp++;
				ele=ele-2;
			}
			System.out.println();
		}sc.close();
	}
}
