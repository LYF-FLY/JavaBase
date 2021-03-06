/*
封装：只对外界提供有用的属性和行为，外界用不到就private
this的作用，是java内部定义的
构造函数；只能用来创建对象的，系统在类中自动加入一个构造函数
特点：1、和类同名2.无返回值3、如果自己写了构造函数，那么系统就不会自动加入空参的构造函数了，所以还要自己写一个空的
static:修饰成员，成员变量，成员方法


*/
class GirlFriend
{
	static String contry="CN";//所有的GirlFriend对象共享一个country内存，并且在实例化对象以前就开辟内存了
	private String temper;
	private String name;
	private int age;
	private int weight;
	private int height;
		
	GirlFriend()//构造函数之间调用必须写在第一行
	{
			this(20);
		
	}
	GirlFriend(int age)
	{
		//this(); 不能互相调用
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;//name = str; //若name = name 局部变量和成员变量同名，优先使用局部变量，即使用自己的变量
	}
	public String getName()
	{
		return name;
	}

	public void setAge(int age)
	{
		this.age = age;//this相当于对象，对象只能访问它自己的成员变量，而age是局部变量，所以this.age就和age区分开了
		
	}
	public int getAge()
	{
		return age;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public int getHeight()
	{
		return height;
	}
	public void setTemper(String temper)
	{
		this.temper = temper;
	}
	public String getTemper()
	{
		return temper;
	}

	public boolean compareAge(GirlFriend other)
	{
		return this.age == other.age;
			
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		GirlFriend liupei = new GirlFriend(); //当JVM执行这行代码时，this就指向当前使用的对象
		liupei.setAge(22);//当JVM执行这行代码时，当前使用的对象是liupei所指向的对象，所以this就指向liupei所指向的对象，相当于吧liupei中存储的地址赋给this
		
		liupei.contry="usa";//所有的对象都会变成usa
		System.out.println(GirlFriend.contry);//因为未实例化以前就开辟内存了

		GirlFriend lv = new GirlFriend();
		lv.setAge(22);
		System.out.println(lv.getAge());
		System.out.println();


		boolean boo = liupei.compareAge(lv);
		System.out.println(boo);

	}
}

class Demo2
{
	GirlFriend gir = new GirlFriend();//构造函数是用来创建对象的
}