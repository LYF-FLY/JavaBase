/*
contains �õĶ����eaquals����������������дeaquals������
*/
import java.util.*;
class Person
{
	private String name;
	private int age;

	Person(){}
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return this.name + " " + this.age;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			throw new ClassCastException("���Ͳ���");
		Person per = (Person)obj;
		return this.name == per.name && this.age == per.age;
	}
}
class Demo5 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();

		list.add(new Person("����",10));
		list.add(new Person("����",20));
		list.add(new Person("����",20));
		list.add(new Person("����",11));

		ArrayList list1 = quChong(list);
		sop(list1);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static ArrayList quChong(ArrayList list)
	{
		ArrayList list1 = new ArrayList(); //�¼��ϲ��ظ�
		for (int i=0; i<list.size(); i++)
		{
			Object obj = list.get(i);
			if(!list1.contains(obj)) //�ײ����equalsʵ�֣��Աȵ����ڴ��ַ
			{
				list1.add(obj);
			}
		}
		return list1;
	}
}
