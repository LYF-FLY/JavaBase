/*
TreeSet���ײ��Ƕ��������ݴ洢��Set��β��������
			�߱�������:���뵽����Ķ������ܱȽϴ�С��
			1����ӵ����ϵĶ�����������Ҫʵ��Comeparable�ӿ��е�comepareTo����
			���������ݸ÷����ķ���ֵ��ȷ��˭��˭С����ֵΪ��֤��������ͬ

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

	public int compareTo(Object obj) //�������Ĳ�����������������ֵ�ж�����ֵ˭��˭С
	{

		//return 0;//һ��
		return 1;
	}
}
//����������������,ֻ���Զ�����
class ComByName implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		if(!(obj1 instanceof Student))
			throw new ClassCastException("���Ͳ���");
		if(!(obj2 instanceof Student))
			throw new ClassCastException("���Ͳ���");

		Student str1 = (Student)obj1;
		Student str2 = (Student)obj2;

		int num = str1.getName().compareTo(str2.getName());//�ַ����ıȽϷ�����compareTo
		return num == 0? str1.getAge() - str2.getAge():num;//���������ͬ�ˣ���׼����Ҫ�ķ���
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
