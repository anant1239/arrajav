package hello;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args)
	{
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=num.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}	
}
