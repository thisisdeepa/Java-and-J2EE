package program2;
import java.util.Comparator;
public class sorting implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1.price<o2.price)
		return -1;
		else if(o1.price==o2.price)
			return 0;
		else
			return 1;
	}

}
