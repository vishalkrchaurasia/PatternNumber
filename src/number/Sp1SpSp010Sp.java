package number;
/*Enter the number
7
      1 
    0 1 0 
  1 0 1 0 1 
0 1 0 1 0 1 0 
  1 0 1 0 1 
    0 1 0 
      1 
*/
import java.util.Scanner;

public class Sp1SpSp010Sp {

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
			}int k;
			if(i%2==1)
			 k=1;
			else
				k=0;
			for(int j=1;j<=ele;j++)
			{
				System.out.print(k+" ");
				k=(k+1)%2;
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
