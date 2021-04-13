import java.util.*;
import java.util.Scanner;
class Student
{
	private String num;
	private String name;
	private int age;

	Student(){}

	Student(String num, String name,int age )
	{	
		   this.num = num;
		   this.name = name;
		   this.age = age;
	}
	public String getName()
	{
		return this.name;
	}

	public String toString()
	{
		return this.num + " " + this.name + " " + this.age;
	}
} 
class Test1 
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add(new Student("01","张三",20));
		list.add(new Student("02","李四",18));
		list.add(new Student("03","王五",22));
		list.add(new Student("04","赵六",20));
		list.add(new Student("05","田七",21));

		System.out.println("请输入你想查找的姓名");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		search(str,list);
	}
	public static void sop(Object obj) 
	{
		System.out.println(obj);
	}

	public static void search(String str, List list)
	{
		int i = 0;
		for (; i<list.size(); i++)
		{
			if(str == list.get(i).getName())
			{
				sop(list.get(i));
				break;
			}

		}
		if(i == list.size())
			sop("没找到");
	}
	
}
