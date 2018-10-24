package miscelaneous;
/*
      R 
    R a g 
  R a g h u 
        R 
      R a g 
    R a g h u 
*/
public class PatternSpaceRSpaceRag {

public static void main(String[] args) {
		
		String s="Raghu";
		for(int i=0;i<s.length();i+=2)
		{
			for(int j=0;j<=s.length()-i;j++)    
			{    
				System.out.print(" "); 
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
		int n=s.length();
		for(int i=1;true;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<2*i-1;j++)
			{
				System.out.print(s.charAt(j)+" ");
				if(j==s.length()-1)
					System.exit(0);
			}
			System.out.println();
		}
}
}
