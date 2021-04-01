abstract class  Transport
{
	private String kind;
	private String color;
	private int price;
	Transport(){}
	Transport(String kind, String color, int price)
	{
		this.kind = kind;
		this.color = color;
		this.price = price;
	}
	public abstract void start();
	public abstract void end();
}

class Freight extends Transport
{
	private int load;
	private int miles;
	private Owner owner;
	Freight(){}
	Freight(String kind, String color, int price, int load, int miles, Owner owner)
	{
		super(kind, color, price);
		this.load = load;
		this.miles = miles;
		this.owner = owner;
		
	}

	public void start()
	{
		System.out.println("货车载着"+load+"吨东西出发了");
	}
	public void end()
	{
		System.out.println("货车行驶了"+miles+"里程之后到达了目的地开始卸货");
	}
	 public void show()
	{
		System.out.println("货车的主人是"+owner.getName()+"，该车行驶的里程数"+miles+"和载货量"+load);
	}

}
class Owner
{
	private String name;
	private int age;
	private String sex;

	Owner(){}
	Owner(String name, int age, String sex)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String sex()
	{
		return this.sex;
	}
}

class  Demo1
{
	public static void main(String[] args) 
	{
		Owner owner = new Owner("吕元发",22,"男");
		Freight freight = new Freight("货车","白色",1000, 1000,1000,owner);
		freight.start();
		freight.end();
		freight.show();
	}
}

//==================================
class Person
{
	private String name;
	private int age;

	Person(){}
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void display()
	{
		System.out.println("姓名是"+this.name+"  年龄是"+this.age);
	}

	public static void main(String[] args) 
	{
		Person person = new Person("吕元发",22);
		person.display();
	}
}
//================
abstract class Door
{
	public abstract void openDoor();
	public abstract void closeDoor();
}
interface theftProof
{
	void theftProof();
}
interface waterProof
{
	void waterProof();
}
interface bulletProof
{
	void bulletProof();
}
class TheftProofDoor extends Door implements theftProof
{
	static String name = "防盗门";
	
	public  void openDoor()
	{
		System.out.println(this.name+"开了");
	}
	public  void closeDoor()
	{
		System.out.println(this.name+"关了");
	}
	public void theftProof()
	{
		System.out.println(this.name+"防盗");	
	}

}
class WaterProofDoor extends Door implements waterProof
{
	static String name = "防水门";
	
	public  void openDoor()
	{
		System.out.println(this.name+"开了");
	}
	public  void closeDoor()
	{
		System.out.println(this.name+"关了");
	}
	public void waterProof()
	{
		System.out.println(this.name+"防水");	
	}

}
class BestDoor extends Door implements waterProof,theftProof,bulletProof
{
	static String name = "综合门";
	
	public  void openDoor()
	{
		System.out.println(this.name+"开了");
	}
	public  void closeDoor()
	{
		System.out.println(this.name+"关了");
	}
	public void  waterProof()
	{
		System.out.println(this.name+"防水");	
	}
	public void theftProof()
	{
		System.out.println(this.name+"防盗");	
	}
	public void bulletProof()
	{
		System.out.println(this.name+"防弹");	
	}

}
class Demo
{
	public static void main(String[] args) 
	{
		WaterProofDoor waterdoor = new WaterProofDoor();
		waterdoor.openDoor();
		waterdoor.closeDoor();
		waterdoor.waterProof();

		TheftProofDoor theftdoor = new TheftProofDoor();
		theftdoor.openDoor();
		theftdoor.closeDoor();
		theftdoor.theftProof();

		BestDoor bestdoor = new BestDoor();
		bestdoor.openDoor();
		bestdoor.closeDoor();
		bestdoor.theftProof();
		bestdoor.waterProof();
		bestdoor.bulletProof();





	}
}
