/*
TreeMap
���ݼ�����  �ñ��Ƚϵ���ʵ��comparable�ӿڵ�cmpareTo����
�����Զ���Ƚ���ʵ��comparator��compare����
*/
import java.util.*;
class Student
{
	public void getName(){}
}
class ComByName implements Comparator<Student>
{
	public int compare(Student stu1, Student stu2)
	{
		int n = stu1.getName().compareTo(stu2.getName());
	return n;
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		ComByName com = new ComByName();
		Map<Student, String> map = new TreeMap<>(com);
		System.out.println("Hello World!");
	}
}