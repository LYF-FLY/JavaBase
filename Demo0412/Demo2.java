/*
TreeSet���ײ��Ƕ��������ݴ洢��Set��β��������
			�߱�������:���뵽����Ķ������ܱȽϴ�С��
			1����ӵ����ϵĶ�����������Ҫʵ��Comeparable�ӿ��е�comepareTo����
			���������ݸ÷����ķ���ֵ��ȷ��˭��˭С����ֵΪ��֤��������ͬ

*/
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
class Demo2 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add("sdf");
		ts.add("dfsd");
		ts.add("sfasf");
		System.out.println(ts);
	}
}
