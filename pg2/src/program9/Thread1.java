package program9;
import java.util.Scanner;
public class Thread1 extends Thread{
	Scanner sc = new Scanner(System.in);
		String []num= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		public void run()
		{
		try
		{
			int n=sc.nextInt();
			String sn= String.valueOf(n);
			if(sn.length()<4)
			{
				throw new Exception();
			}
			else
			{
				while(n!=0)
				{
					int numb=n%10;
					System.out.println(num[numb]);
					n=n/10;

				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Number greater than 4");
		}
		}
}
