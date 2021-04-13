import java.util.*;
class Home1 
{
	public static void main(String[] args) 
	{
		Collection col = getStudents();

		System.out.println(col);
		findInfo(col,"����");

		getInfos(col);

		findStu(col,"����","�ű�");

		System.out.println(col);


	}

	//--1.����ЩStudent����Ž�������
	public static Collection getStudents()
	{
		String ss="01#����#20*02#����#18*03#����#22*04#����#20*05#����#21";
		String[] arr = ss.split("\\*");
        
		Collection coll=new ArrayList();
		Student stu=null;
		for(int i=0;i<arr.length;i++)
		{
			stu=new Student(arr[i]);
			coll.add(stu);
		}

		return coll;
	}
	//��ѯ������û�н����ߵ�ѧ������������ӡѧ���ľ�����Ϣ����װ�ɷ�������������������
	public static void findInfo(Collection coll,String name)
	{
		for(Object obj:coll)
		{
			Student stu=(Student)obj;
			if(stu.getName().equals("����"))
				System.out.println(stu);
		}
	}
	//3.��������ѧ����ƽ�����䣬������䣬��С����
	public static void getInfos(Collection coll)
	{
		Iterator ite=coll.iterator();
		double sum=0;
		int  max=0;
		int min=0;
		Student stu=null;
		if(ite.hasNext())
		{
			stu = (Student)ite.next();
			sum=stu.getAge();
			max=stu.getAge();
			min=stu.getAge();
		}

        while(ite.hasNext())
		{
			stu = (Student)ite.next();
            sum=sum+stu.getAge();

			if(stu.getAge()>max)
				max=stu.getAge();

			if(stu.getAge()<min)
				min=stu.getAge();
		}

        System.out.printf("max=%d,min=%d,%.1f",max,min,sum/coll.size());
	}

	//����������ֽ������Ľ����ָ�Ϊ�ű�
	public static void findStu(Collection coll,String name,String newName)
	{
		for(Object obj:coll)
		{
			Student stu=(Student)obj;
			if(stu.getName().equals("����"))
				stu.setName("�ű�");
		}
	}


}


class Student
{
	private int num;
	private String name;
	private int age;


	Student()
	{}

	Student(int num,String name,int age)
	{
		this.num=num;
		this.name=name;
		this.age=age;
	}

	Student(String str)
	{
		String[] arr=str.split("#");
		this.num=Integer.parseInt(arr[0]);
		this.name=arr[1];
		this.age=Integer.parseInt(arr[2]);
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public int getAge()
	{
		return age;
	}

	public String toString()
	{
		return num+","+name+","+age;
	}
}

/*
1.�������ַ���

   01#����#20*02#����#18*03#����#22*04#����#20*05#����#21 

����Student�࣬���ԣ�ѧ��  ���� ����

--1.����ЩStudent����Ž�������

--2.��ѯ������û�н����ߵ�ѧ������������ӡѧ���ľ�����Ϣ����װ�ɷ�������������������

--3.��������ѧ����ƽ�����䣬������䣬��С����

--4.����������ֽ������Ľ����ָ�Ϊ�ű�

*/