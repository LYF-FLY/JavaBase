class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

class User
{
	 int id;
	 String password;
	 String email;

	User()
	{}

	User(int id, String password, String email)
	{
		this.id = id;
		this.password = password;
		this.email = email;
	}

	User(int id, String password)
	{
		this(id,password,id+"@qf.com");
	}

}
//===========================================
class Puke
{
	int num;
	String color;
	Puke(){}
	Puke(int num, String color)
	{
		this.num = num;
		this.color = color;
	}
}
class Hand
{
	

	Puke puke;

	public void hold(Puke puke)
	{
		this.puke = puke;
	}

	public void change(Puke left, Puke right)
	{
		Puke temp = left;
		left = right;
		right = temp;
	}
	

}
class Person
{
	Hand hand;

	hand.change(p1,p2);
	
	String name;
	
}

class Demo2
{
	public static void main(String[] args)
	{
		Puke p1 = new Puke(1,"green");
		Puke p2 = new Puke(2,"red");

		Person xiaoming = new Person();

		xiaoming.hand.change(p1,p2);

		System.out.println(p1.color);
		


	
	}

}