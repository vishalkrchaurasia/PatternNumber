package number;
/*
Enter the number
5
    1 
   010 
  10101 
 0101010 
101010101 

*/
import java.util.Scanner;

public class PatternSpace1SpaceSpace010__ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				if(i%2==0){
					if(j%2==0)
					{
						System.out.print(1);
					}else
						System.out.print(0);
				}else
					if(j%2==0){
						System.out.print(0);
					}else
					{
						System.out.print(1);
					}
			}
			System.out.println(" ");
		}sc.close();
	}
}
