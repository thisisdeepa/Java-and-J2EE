package pg2;

public class Book {
	String title;
    String auth;
    String pub;
    int price;
    public Book(String title, String auth, String pub, int price)
    {
        this.title=title;
        this.auth=auth;
        this.pub=pub;
        this.price=price;
    }
    public String toString()
    {
        return "Book [title=" + title+ " author= "+auth+ " publisher= "+pub+" price= "+price+" ]";
    }

}
