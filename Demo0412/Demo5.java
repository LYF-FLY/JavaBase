/*
TreeSet：底层是二叉树数据存储，Set结尾所以无序
			具备排序功能:加入到里面的对象是能比较大小的
			1、添加到集合的对象所属的类要实现Comeparable接口中的comepareTo方法
			集合是依据该方法的返回值来确定谁大谁小返回值为零证明二者相同

*/
import java.util.*;
class Student implements Comparable
{
	private String name;
	private int age;

	Student(){}
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return this.name + this.age;
	}

	public int compareTo(Object obj) //二叉树的插入根据这个方法返回值判断两个值谁大谁小
	{

		//return 0;//一样
		return 1;
	}
}
//根据姓名长短排序,只能自定义了
class ComByName implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		if(!(obj1 instanceof Student))
			throw new ClassCastException("类型不对");
		if(!(obj2 instanceof Student))
			throw new ClassCastException("类型不对");

		Student str1 = (Student)obj1;
		Student str2 = (Student)obj2;

		int num = str1.getName().compareTo(str2.getName());//字符串的比较方法是compareTo
		return num == 0? str1.getAge() - str2.getAge():num;//如果名字相同了，就准备次要的方法
	}
}
class Demo5
{
	public static void main(String[] args) 
	{
		ComByName comByName = new ComByName();
		TreeSet hs = new TreeSet(comByName);
		hs.add(new Student("zhangsan",18));
		hs.add(new Student("zhangsan",18));
		hs.add(new Student("lisi",18));

		System.out.println(hs);
	}
}
