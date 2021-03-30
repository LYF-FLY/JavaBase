/*
������
����Ը����й��Եķ������Ų�ͬ��ʵ�ַ�ʽ�������оͲ�ʵ�ָ÷�����
���г��󷽷����ཻ������
��������ص�
1�����ܴ�������
2��������븸��ĳ��󷽷�

������϶��Ǹ��࣬��Ϊ�����ܴ�������
�������й��췽�����������Լ�����д���췽����������췽���Ǹ������õ�
���ܺ�final��ͬ�ã���Ϊfinal���������࣬�������������࣬final�ķ���������д
���ܺ�static��static���εķ�������ֱ��ͨ���������ã�abstract���εķ������ܱ�����
private���εķ������ܱ���д��������ķ�����Ҫ����д
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

