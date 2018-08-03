import java.util.*;
public class fact {

	public static void main(String[] args)
	{
		int f=1,n=0;
		System.out.println("enter the no :"); 
		Scanner a = new Scanner(System.in);
		n= a.nextInt();
		a.close();
		if(n==0)
		{
			System.out.println(1);
		}
		if(n==1)
		{
			System.out.println(1);
		}
		for(int i=2;i<=n;i++)
		
				
			{
				f = f*i;
				
	         }
		System.out.println(f);
				
	}
	

}

