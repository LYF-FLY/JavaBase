/*
设计模式：解决某一类问题最有效的方法
		23种设计模式
		单例设计模式：解决的是一个类只有一个对象的问题
		1、默认一个类可以创造多个对象，构造方法私有了。就不能创建多个对象
		2、构造方法私有了，一个对象就没了，私有的构造方法在本类中是可以用的
		3、在本类中创建的对象需要让外界得到，提供public的方法
		4、因为外界不能创造对象，所以public方法必须静态
		5、因为静态的只能使用静态的成员，所以成员变量也需要是静态de

在子类创建对象时，先执行父类的构造方法，再执行子类的构造方法
因为系统自动在子类的构造方法的第一行加入super（）
子类继承父类，必然继承父类的属性，可以利用父类的给该属性赋值的语句


*/

class SuperMan//饿汉式
{
	private static SuperMan man = new SuperMan();//一个成员变量同时初始化，防止外界通过类名直接对他修改所以把他修改为private

	private SuperMan(){}

	public static SuperMan getSuperMan()//外界无法通过实例化获取，只能静态方法才行，而且里面的成员必须也是静态的
	{
		return man;
	}
}
class Single//懒汉式，多线程存在数据并发问题
{
	private static Single single;//没创建实例

	private Single(){}//无法实例化

	public static Single getInstance()
	{
		if(single == null)
			single = new Single();
		return single;
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		SuperMan sm = SuperMan.getSuperMan();
		Single.getInstance();
	}
}
/*
工厂加工零件
*/

class Factory
{
	private static Factory factory = new Factory();

	private Factory(){}

	private int num;

	public static Factory getInstance()
	{
		return factory;
	}

	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return this.num;
	}

	public void process()
	{
		num++;
		System.out.println("这是第"+num+"个零件");
	}

}
class Demo2
{
	public static void main(String[] args) 
	{
		Factory fc = Factory.getInstance();
		fc.process();

	}
}

//构造方法的继承
class Fu
{
	private int age;
	Fu(int age)
	{
		this.age = age;
	}
	Fu()
	{
		System.out.println("fu");
	}
}
class Zi extends Fu
{
	Zi()
	{
		//super();尽量写上，防止子类出问题
		System.out.println("zi");
	}
	Zi(int age)
	{
		super(age);
	}
}

class Demo3
{
	public static void main(String[] args) 
	{
		Zi zi = new Zi();

	}
}
//继承中的成员变量,super不是引用，只有当父类和子类中有同名冲突时，进行区分，子类的成员变量不会把父类的覆盖
class Fa
{
	private int num = 5;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
}
class Son extends Fa
{
	int num = 6;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	public void show()
	{
		System.out.println(super.getNum());
	}
}
class Demo4
{
	public static void main(String[] args) 
	{
		Son son = new Son();
		son.show();

	}
}