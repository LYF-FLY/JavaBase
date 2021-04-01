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
		System.out.println("��������"+load+"�ֶ���������");
	}
	public void end()
	{
		System.out.println("������ʻ��"+miles+"���֮�󵽴���Ŀ�ĵؿ�ʼж��");
	}
	 public void show()
	{
		System.out.println("������������"+owner.getName()+"���ó���ʻ�������"+miles+"���ػ���"+load);
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
		Owner owner = new Owner("��Ԫ��",22,"��");
		Freight freight = new Freight("����","��ɫ",1000, 1000,1000,owner);
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
		System.out.println("������"+this.name+"  ������"+this.age);
	}

	public static void main(String[] args) 
	{
		Person person = new Person("��Ԫ��",22);
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
	static String name = "������";
	
	public  void openDoor()
	{
		System.out.println(this.name+"����");
	}
	public  void closeDoor()
	{
		System.out.println(this.name+"����");
	}
	public void theftProof()
	{
		System.out.println(this.name+"����");	
	}

}
class WaterProofDoor extends Door implements waterProof
{
	static String name = "��ˮ��";
	
	public  void openDoor()
	{
		System.out.println(this.name+"����");
	}
	public  void closeDoor()
	{
		System.out.println(this.name+"����");
	}
	public void waterProof()
	{
		System.out.println(this.name+"��ˮ");	
	}

}
class BestDoor extends Door implements waterProof,theftProof,bulletProof
{
	static String name = "�ۺ���";
	
	public  void openDoor()
	{
		System.out.println(this.name+"����");
	}
	public  void closeDoor()
	{
		System.out.println(this.name+"����");
	}
	public void  waterProof()
	{
		System.out.println(this.name+"��ˮ");	
	}
	public void theftProof()
	{
		System.out.println(this.name+"����");	
	}
	public void bulletProof()
	{
		System.out.println(this.name+"����");	
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
