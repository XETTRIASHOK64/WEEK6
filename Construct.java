package fall2023;

public class Construct {
	int marks;
	String course;
Construct()
{
	System.out.println("Example for Constructor");
}

Construct(int a, String b )
{
	System.out.println("age is "+ a);
	System.out.println("name is "+ b);
}
Construct(String a, int marks)
{
	course=a;
	System.out.println("course name is "+ course);
	System.out.println("score is "+ marks);
}
public static void main(String[] args) {
	Construct r=new Construct();
	Construct z=new Construct(20,"joe");
	Construct t=new Construct("java",40);
}
}
