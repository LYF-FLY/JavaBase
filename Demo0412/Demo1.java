/*
HashSet :�ײ������������

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

	public boolean equals(Object obj)//��дeqauals������Ҫ����������һ������ͬ����Ȼ�Ƚϵ��Ƕ���ĵ�ַ���ͻ���Ϊ�ǲ��Ե�
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("���ʹ���");

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
