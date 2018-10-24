package miscelaneous;
/*Enter the Number 5

0 
1 1 
2 3 5 
8 13 21 34 
55 89 144 233 377 
*/
import java.util.Scanner;

public class PatternFibbonacci011235 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int t1=0,t2=1,nextTerm;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print(t1+" ");
			    nextTerm = t1 + t2;
			    t1 = t2;
			    t2 = nextTerm;
			    }System.out.println();
			}
		sc.close();
	}
}