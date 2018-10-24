package number;
/*Enter the number
7
      1 
    2 3 4 
  5 6 7 8 9 
1 2 3 4 5 6 7 
  8 9 1 2 3 
    4 5 6 
      7 
*/
import java.util.Scanner;

public class Sp1SpSp234SpSp56789Sp1_9__ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int k=1;
		int sp=n/2,ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=ele;j++)
			{
				System.out.print(k+" ");
				k++;
				if(k==10)
					k=1;
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
