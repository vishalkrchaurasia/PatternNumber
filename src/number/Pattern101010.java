package number;
/*
Enter the number
5
1
01
010
1010
10101

*/
import java.util.Scanner;

public class Pattern101010 {

	public static void main(String[] args) {
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k%2);
			k++;
		}
		System.out.println();
	}sc.close();
}
}
