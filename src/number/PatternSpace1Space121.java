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

public class PatternSpace1Space121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)    
		{    
		for(int j=1;j<=n-i;j++)    
		{    
			System.out.print("  ");    
		}    
		for(int k=1;k<=i;k++)    
		{    
			System.out.print(k+" ");    
		}    
		for(int l=i-1;l>=1;l--)    
		{    
			System.out.print(l+" ");    
		}    
			System.out.println();    
	}sc.close();
}
}