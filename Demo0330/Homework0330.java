/*
1.��֪����������USB�ӿڣ��ֱ�ȥʵ����һ����꣬һ�����̣�һ��U�������ӵ������ϡ�
���ÿһ��USB�ӿ����ӵ��豸��Ϣ


2.���һ����ͨ���߳����࣬�ṩ���󷽷�--��ʻ

������Ϊ��ͨ���ߵ�һ�֣�ʵ���˼�ʻ�ķ���(����·�ϼ�ʻ)
����Ϊ��ͨ���ߵ�һ�֣�ʵ���˼�ʻ�ķ���(����·�ϼ�ʻ)
�ɻ���Ϊ��ͨ���ߵ�һ�֣�ʵ���˼�ʻ�ķ���(�����ϼ�ʻ)
������һ�������࣬�ڲ������main�����У��ֱ�ʵ����һ�������Ķ��󣬻𳵵Ķ���ͷɻ��Ķ��󣬲��ֱ�������ʻ��Ϊ


3.���һ����������淶(�ӿ�): ϴ�·�, ɨ��, ���, ����
���һ����ķ��, ��ķ��Ҫ��ѭ��Щ�淶
�����ڲ������У�ʵ����һ����ķ�Ķ���Ȼ���ñ�ķ��ˣ�������ɨ��


4.���һ�������࣬����: �������Ա�
���һ��è�࣬���һ�����࣬ è�͹����̳��Զ�����
�����ڲ����������һ�����������������Ҫһ�����������������Ϳ�����è�࣬Ҳ�����ǹ��� -->��̬(������ )


5.���һ�����ݴ���ӿڣ�Type-C��׼
���һ����ˮ�Ľӿڣ���ˮ
���һ���ֻ��࣬ʵ��������ݴ���ӿڣ�����Type-C��ͬʱʵ���˷�ˮ�Ľӿ�

*/
interface usb
{
	void show();
}
class Mouse implements usb
{
	public void show()
	{
		System.out.println("�������");
	}
}
class KeyBord implements usb
{
	public void show()
	{
		System.out.println("���Ǽ���");
	}
}
class Upan implements usb
{
	public void show()
	{
		System.out.println("��������");
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		usb mouse = new Mouse();
		usb keyboard = new KeyBord();
		usb upan = new Upan();
		mouse.show();
		keyboard.show();
		upan.show();

	}
}
//=============
abstract class Transport
{
	public abstract void drive();
}
class Car extends Transport
{
	public void drive()
	{
		System.out.println("������·����");
	}
}
class Plane extends Transport
{
	public void drive()
	{
		System.out.println("������������");
	}
}
class Demo2
{

	public static void main(String[] args)
	{
		Transport car = new Car();
		Transport plane = new Plane();
		car.drive();
		plane.drive();
	}
}
//===============================
interface Stander
{
	void wash();
	void clean();
	void buy();
	void cook();
}
class Nanny
{
	public void wash()
	{
		System.out.println("��ȥϴ�·���");
	}
	public void clean()
	{
		System.out.println("��ȥɨ����");
	}
	public void buy()
	{
		System.out.println("��ȥϴ������");
	}
	public void cook()
	{
		System.out.println("��ȥ������");
	}
}
class Demo3
{

	public static void main(String[] args)
	{
		Nanny na = new Nanny();
		na.clean();
		na.cook();
		na.buy();
		na.wash();
	}
}
//==================
class Animal
{
	String name;
	String sex;

}
class Dog extends Animal
{
}
class Cat extends Animal
{
}
class Demo4
{

	public static void main(String[] args)
	{
		Animal dog = new Dog();
		Animal cat = new Cat();
		changeSex(dog);
		changeSex(cat);

		System.out.println("dogsex"+dog.sex+"catsex"+cat.sex);
	}
	public static void changeSex(Animal animal)
	{
		animal.sex = "femal";
	}
}
 //=============================
interface datatrans
{
	void typec();
}
interface waterproof
{
	void waterpro();
}
class Phone implements datatrans, waterproof
{
	public void typec()
	{
		System.out.println("�ҷ�ˮ");
	}
	public void waterpro()
	{
		System.out.println("��֧��type-c");
	}
}
class Demo5
{

	public static void main(String[] args)
	{
		Phone phone = new Phone();
		phone.typec();
		phone.waterpro();
	}
}
 