/*
接口：
interface 接口名
{
	public static finanl 成员变量； //常量，默认修饰的
	public abstract 成员方法；//默认修饰为抽象方法
}

接口是可以有相同的方法，调用的肯定是子类中重写的方法

类和类之间是继承关系
  通过继承可以得到该继承体系中的共性的属性和方法
类和接口是实现关系
  可以实现继承中没有的东西

 
*/
interface Inter
{
	//int num = 66; 这里会调用不明确
	void fun();//修饰词不写也是默认的
}
interface Inter2
{
	int num = 66;
	void fun();//修饰词不写也是默认的
}
class Person implements Inter, Inter2
{
	public void fun()
	{
		System.out.println(this.num);
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{
		Person per = new Person();
		per.fun();
		System.out.println(Inter2.num);
		System.out.println(Person.num);
	}
}
