package program1;

public class Contact {
		String name;
		Long num;
		
		Contact(String name, Long num)
		{
			this.name=name;
			this.num=num;
		}
		
		public String toString()
		{
			return name+"  "+num;
		}
}
