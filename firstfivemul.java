import java.util.*;
public class fact {

	public static void main(String[] args)
	{
		int f=1,n=0;
		System.out.println("enter the no :"); 
		Scanner a = new Scanner(System.in);
		n= a.nextInt();
		a.close();
		for(int i=1;i<=5;i++) {
			f=n*i;
			System.out.println(f);
		}
	}
	

}

