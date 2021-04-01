/*
模板设计模式：在实现有一个功能时，一部分是确定的，一部分是不确定的，确定的代码会用到不确定的代码
				把不确定的部分暴露出去，用抽象方法，让子类去实现

如计算一个功能的运算时间

toString输出类名+哈希值没用，所以一般重写
*/
abstract class MoBan
{
	public void calculateTime()
	{
		long start = System.currentTimeMillis();//记录开始时间

		fun();//功能

		long end = System.currentTimeMillis();//结束时间

		System.out.println("运行时间"+(end-start)+"ms");
	}
	public abstract void fun();
}
class Test extends MoBan
{
	public void fun()
	{
		for (int i = 1; i<=3000; i++)
		{
			System.out.println(i);
		}
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{ 
		Test text = new Test();
		text.calculateTime();
	}
}

//object是超类
class Person
{
	int age;
	Person(){}
	Person(int age)
	{
		this.age = age;
	}
	//判断两个人是否是同龄人
	//public boolean isAgeEqual(Person ren)
	//{
	//	return this.age = ren.age;
	//}
	public boolean eaquals(Object obj)
	{
		if(obj == null)
			return false;
		if(obj instanceof Person)//如果是Person类就向下转型
		{
			Person ren = (Person)obj;//obj里没有age
			return this.age == ren.age;
		}
		return false;
	}
	//重写String方法
	public String toString()
	{
		return age+"";
	}
}
class Student extends Person
{
}
class Dog
{
}
class Demo2
{
	public static void main(String[] args)
	{
		//boolean equals(object obj) 任何两个对象都能判断,依据内存地址判断
		Person ren = new Person();
		Dog dog = new Dog();
		boolean boo = ren.equals(dog);
		System.out.println(boo);

		Person ren1 = new Person(18);
		Person ren2 = new Person(18);
		System.out.println(ren1.eaquals(ren2));

		//String toString(); 返回对象的字符串表示
		//System.out.println(ren.toString());//类名+哈希值
		//System.out.println(ren);//输出一个对象也在默认调用toString方法
		//System.out.println(Integer.toHexString(ren.hashCode()));//hash值转十六进制
		//Class clas = ren.getClass();//Person.class的字节码
		//String name = clas.getName();//从字节码中获取类名
		//System.out.println(ren.getClass().getName()+"@"+Integer.toHexString(ren.hashCode()));


		
	}
}