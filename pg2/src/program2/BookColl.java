package program2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
public class BookColl {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Book b1=new Book("database","sha","skm",650);
		Book b2=new Book("dms","john","grv",850);
		Book b3=new Book("blockchain","sha","skm",350);
		Book b4=new Book("cn","george","knn",450);
		
		ArrayList<Book> arr= new ArrayList<>(0);
		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		arr.add(b4);
		
		for(Book b:arr)
		{
			System.out.println(b.toString());		}
		Collections.sort(arr, new sorting());
	
	for(Book b:arr)
	{
		System.out.println(b.toString());		}
	
	
	HashMap<Integer,Book> hm=new HashMap<>();
	hm.put(11, b1);
	hm.put(11, b2);
	hm.put(11, b3);
	hm.put(11, b4);
	

	
	System.out.println("Enter the name ");
	String authnew=sc.nextLine();
	for(Book b:arr)
	{
		if(b.author.equalsIgnoreCase(authnew))
		{
			System.out.println(b.toString());		

		}
	}


	
}	

}
