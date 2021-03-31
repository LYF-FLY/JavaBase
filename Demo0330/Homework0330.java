/*
1.已知电脑有三个USB接口，分别去实例化一个鼠标，一个键盘，一个U盘来连接到电脑上。
输出每一个USB接口连接的设备信息


2.设计一个交通工具抽象类，提供抽象方法--驾驶

汽车作为交通工具的一种，实现了驾驶的方法(在马路上驾驶)
火车作为交通工具的一种，实现了驾驶的方法(在铁路上驾驶)
飞机作为交通工具的一种，实现了驾驶的方法(在天上驾驶)
需求：做一个测试类，在测试类的main函数中，分别实例化一个汽车的对象，火车的对象和飞机的对象，并分别描述驾驶行为


3.设计一个家政服务规范(接口): 洗衣服, 扫地, 买菜, 做饭
设计一个保姆类, 保姆需要遵循这些规范
需求：在测试类中，实例化一个保姆的对象，然后让保姆买菜，做饭，扫地


4.设计一个动物类，属性: 姓名，性别
设计一个猫类，设计一个狗类， 猫和狗都继承自动物类
需求：在测试类中设计一个方法，这个方法需要一个参数，参数的类型可以是猫类，也可以是狗类 -->多态(动物类 )


5.设计一个数据传输接口：Type-C标准
设计一个防水的接口：防水
设计一个手机类，实现这个数据传输接口，采用Type-C；同时实现了防水的接口

*/
interface usb
{
	void show();
}
class Mouse implements usb
{
	public void show()
	{
		System.out.println("我是鼠标");
	}
}
class KeyBord implements usb
{
	public void show()
	{
		System.out.println("我是键盘");
	}
}
class Upan implements usb
{
	public void show()
	{
		System.out.println("我是优盘");
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
		System.out.println("我在马路上跑");
	}
}
class Plane extends Transport
{
	public void drive()
	{
		System.out.println("我在天上上跑");
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
		System.out.println("我去洗衣服了");
	}
	public void clean()
	{
		System.out.println("我去扫地了");
	}
	public void buy()
	{
		System.out.println("我去洗买东西了");
	}
	public void cook()
	{
		System.out.println("我去做饭了");
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
		System.out.println("我防水");
	}
	public void waterpro()
	{
		System.out.println("我支持type-c");
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
 