package program1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ContColl {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Contact c1= new Contact("amit",(long)87655543);
		Contact c2= new Contact("allen",(long)9876543);
		ArrayList<Contact> hm = new ArrayList<>();
		hm.add(c1);
		hm.add(c2);
//		hm.add(c1);
//		hm.add(c1);
		for(Contact c:hm)
		{
			System.out.println(c.toString());
		}
		HashMap<Long,String>mc= new HashMap<>();
		String name1;
		for(int i=0;i<3;i++)
		{
			System.out.println("enter the missed call");
			Long number=sc.nextLong();
			name1="private";
			for(Contact c:hm)
			{
				if(number.equals(c.num))
				{
					System.out.println("Number already exists");
					System.out.println(c.toString());
					name1=c.name;
					break;
				}
				
			}
			mc.put(number,name1);
		}
		
		mc.forEach((number,name)->System.out.println("Name  "+name+"Number  "+number));
			
		hm.remove(c1);
		for(Contact c:hm)
		{
			System.out.println(c.toString());
		}
		}
		

		
	}


