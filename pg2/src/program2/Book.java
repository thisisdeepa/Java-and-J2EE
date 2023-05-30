package program2;

public class Book {
	String title;
	String author;
	String pub;
	int price;
	
	Book(String title,String author,String pub,int price)
	{
		this.title=title;
		this.author=author;
		this.pub=pub;
		this.price=price;
	}
	
	public String toString()
	{
		return title+"   "+author+"   "+pub+"   "+price;
	}
}
