/*
ģ�����ģʽ����ʵ����һ������ʱ��һ������ȷ���ģ�һ�����ǲ�ȷ���ģ�ȷ���Ĵ�����õ���ȷ���Ĵ���
				�Ѳ�ȷ���Ĳ��ֱ�¶��ȥ���ó��󷽷���������ȥʵ��

�����һ�����ܵ�����ʱ��

toString�������+��ϣֵû�ã�����һ����д
*/
abstract class MoBan
{
	public void calculateTime()
	{
		long start = System.currentTimeMillis();//��¼��ʼʱ��

		fun();//����

		long end = System.currentTimeMillis();//����ʱ��

		System.out.println("����ʱ��"+(end-start)+"ms");
	}
	public abstract void fun();
}
class Test extends MoBan
{
	public void fun()
	{
		for (int i = 1; i<=3000; i++)
		{
			System.out.println(i);
		}
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{ 
		Test text = new Test();
		text.calculateTime();
	}
}

//object�ǳ���
class Person
{
	int age;
	Person(){}
	Person(int age)
	{
		this.age = age;
	}
	//�ж��������Ƿ���ͬ����
	//public boolean isAgeEqual(Person ren)
	//{
	//	return this.age = ren.age;
	//}
	public boolean eaquals(Object obj)
	{
		if(obj == null)
			return false;
		if(obj instanceof Person)//�����Person�������ת��
		{
			Person ren = (Person)obj;//obj��û��age
			return this.age == ren.age;
		}
		return false;
	}
	//��дString����
	public String toString()
	{
		return age+"";
	}
}
class Student extends Person
{
}
class Dog
{
}
class Demo2
{
	public static void main(String[] args)
	{
		//boolean equals(object obj) �κ������������ж�,�����ڴ��ַ�ж�
		Person ren = new Person();
		Dog dog = new Dog();
		boolean boo = ren.equals(dog);
		System.out.println(boo);

		Person ren1 = new Person(18);
		Person ren2 = new Person(18);
		System.out.println(ren1.eaquals(ren2));

		//String toString(); ���ض�����ַ�����ʾ
		//System.out.println(ren.toString());//����+��ϣֵ
		//System.out.println(ren);//���һ������Ҳ��Ĭ�ϵ���toString����
		//System.out.println(Integer.toHexString(ren.hashCode()));//hashֵתʮ������
		//Class clas = ren.getClass();//Person.class���ֽ���
		//String name = clas.getName();//���ֽ����л�ȡ����
		//System.out.println(ren.getClass().getName()+"@"+Integer.toHexString(ren.hashCode()));


		
	}
}