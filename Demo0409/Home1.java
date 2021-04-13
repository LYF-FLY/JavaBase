import java.util.*;
class Home1 
{
	public static void main(String[] args) 
	{
		Collection col = getStudents();

		System.out.println(col);
		findInfo(col,"田七");

		getInfos(col);

		findStu(col,"张三","张兵");

		System.out.println(col);


	}

	//--1.将这些Student对象放进集合中
	public static Collection getStudents()
	{
		String ss="01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
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
	//查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
	public static void findInfo(Collection coll,String name)
	{
		for(Object obj:coll)
		{
			Student stu=(Student)obj;
			if(stu.getName().equals("田七"))
				System.out.println(stu);
		}
	}
	//3.计算所有学生的平均年龄，最大年龄，最小年龄
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

	//如果存在名字叫张三的将名字改为张兵
	public static void findStu(Collection coll,String name,String newName)
	{
		for(Object obj:coll)
		{
			Student stu=(Student)obj;
			if(stu.getName().equals("张三"))
				stu.setName("张兵");
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
1.有如下字符串

   01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21 

创建Student类，属性：学号  姓名 年龄

--1.将这些Student对象放进集合中

--2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）

--3.计算所有学生的平均年龄，最大年龄，最小年龄

--4.如果存在名字叫张三的将名字改为张兵

*/