package pg2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
import pg2.sorts;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("HELLO");
        ArrayList<Book> arr = new ArrayList<>();
        Book b1 = new Book("DBMS", "daniel", "svg", 600);
        Book b2 = new Book("DAA", "John", "caman", 700);
        Book b3 = new Book("CN", "Daniel", "rgg", 400);
        arr.add(b1);
        arr.add(b2);
        arr.add(b3);
        
        for(Book ob:arr)
        {
        	System.out.println(ob.toString());       
 	}
        ArrayList<Book> sar= new ArrayList<>();
       Iterator itr=arr.iterator();
       while(itr.hasNext())
       {
    	   Book b=(Book) itr.next();
    	   sar.add(b);
       }
       System.out.println();
       Collections.sort(sar, new sorts());
       for(Book ob:sar)
       {
    	   System.out.println(ob.toString());     
    	   }
       System.out.println("Enter author to search");
       String nauth=sc.nextLine();
       for(Book ob:arr)
       {
    	   if(ob.auth.equalsIgnoreCase(nauth))
    		   System.out.println(ob.toString());
       }
       
       
       ArrayList<Book> nar= new ArrayList<>();
       int p=500;
       System.out.println();

       for(Book ob:arr)
       {
    	   if(ob.price>p)
    	   {
    		   nar.add(ob);
    	   System.out.println(ob.toString());
    	   }
       }
       System.out.println();

       String nt="D";
       for(Book ob:arr)
       {
    	   if(ob.title.contains(nt))
    	       System.out.println(ob.toString());

       }

	}
		
		
		
		
}

