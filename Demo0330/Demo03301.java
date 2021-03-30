/*
抽象类
子类对父类中共性的方法有着不同的实现方式，父类中就不实现该方法了
含有抽象方法的类交抽象类
抽象类的特点
1、不能创建对象
2、子类必须父类的抽象方法

抽象类肯定是父类，因为他不能创建对象
抽象类有构造方法，还可以自己给他写构造方法，这个构造方法是给子类用的
不能和final共同用；因为final不能有子类，而抽象类有子类，final的方法不可重写
不能和static用static修饰的方法可以直接通过类名调用，abstract修饰的方法不能被调用
private修饰的方法不能被重写，抽象类的方法需要被重写
*/
abstract class Shape
{
	public abstract double area();
}
class Circle extends Shape
{
	
	public static final double PI = 3.14;
	private double radius;

	Circle(){}

	Circle(double radius)
	{
		this.radius = radius;
	}	
}

 class Rectangle extends Shape
{
	private double length;
	private double width;

	Rectangle(){}
	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double area()
	{
		return length*width;
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{
		Circle cir;
		Rectangle rec = new Rectangle(1, 2);
		System.out.println(rec.area());

	}
}

class  Demo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

