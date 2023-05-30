package pg3;

public class Student {
	String name, usn, address, cat;
	int age;
	float cgpa;
	Student(String name, String usn, String address, int age, String cat, float cgpa )
	{
		this.name=name;
		this.usn=usn;
		this.address=address;
		this.cat=cat;
		this.age=age;
		this.cgpa=cgpa;
	}
	public String toString()
	{
		return name+" "+usn+" "+address+" "+age+" "+cat+" "+cgpa;
	}

}
