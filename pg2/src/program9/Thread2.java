package program9;
import java.util.Scanner;
import java.util.ArrayList;
public class Thread2 extends Thread{
		Scanner sc= new Scanner(System.in);
		public void run()
		{
				String text=sc.nextLine();
				ArrayList<Character> arr = new ArrayList<>();
				arr.add('A');
				arr.add('E');
				arr.add('I');
				arr.add('O');
				arr.add('U');
				int v=0;
				char []charr=text.toCharArray();
				for(int i=0;i<text.length();i++)
				{
					char t=Character.toUpperCase(charr[i]);
					if(arr.contains(t))
						v++;
				}
				System.out.println(v);
			
		}
}
