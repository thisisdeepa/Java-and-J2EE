package program3;

public class Student {
	String name;
	int age;
	String cat;
	float cgpa;
	
	Student(String name,int age,String cat,float cgpa)
	{
		this.name=name;
		this.age=age;
		this.cat=cat;
		this.cgpa=cgpa;
	}
	
	public String toString()
	{
		return name+"   "+age+"   "+cat+"   "+cgpa;
	}

}
