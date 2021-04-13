/*
HashSet :底层是数组加链表

*/
import java.util.*;
class Student
{
	private String name;
	private int age;

	Student(){}
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return this.name + this.age;
	}

	public boolean equals(Object obj)//重写eqauals方法，要是姓名年龄一样则相同，不然比较的是对象的地址，就会认为是不对的
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("类型错误");

			Student stu = (Student)obj;

		return this.name.equals(stu.name ) && this.age == stu.age; 
	}

	public int hashCode()
	{
		return name.hashCode() + (this.age)*3;
	}
}
class Demo1
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(new Student("zhangsan",18));
		hs.add(new Student("zhangsan",18));

		System.out.println(hs);

	}
}
