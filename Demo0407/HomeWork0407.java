import java.util.*;
enum Game
{
	 
	SHI("石头"),JIAN("剪刀"),BU("布");
	String desc;


	Game(){}
	Game(String str)
	{
		this.desc = str;
	}

}
class Demo1 
{
	public static void main(String[] args) 
	{
		

		Random ran = new Random();
		int n  = ran.nextInt(3)+1;

		if(n==1)
			System.out.println(Game.SHI);


	}
}

//1.模拟 Arrays.sort 方法，实现如下方法，实现对一个Person数组的排序，
//并用lambda表达式在调用方法的时候，作为第二个参数的实参。
//
//         MyArrays.sort(Person[] array, MyComparator comparator);
//
//接口如下：
class MyArrays
{
	public static void sort(Person[] array, MyComparator comparator)
	{
		Person per = null;
		for (int i =0; i<array.length-1; i++)
		{
			for (int j = i+1; j<array.length; j++ )
			{
				if(comparator.compare(array[i],array[j])>0)
				{
					per = array[i];
					array[i] = array[j];
					array[j] = per;
				}
			}
		}
		
	}
}
interface MyComparator
{
      int compare(Person obj1,Person obj2);
}
	

//Person类如下：

class Person
{
	private String name;
	private int age;

	Person(){}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return this.name;
	}

	public String toString()
	{
		return name+" "+age;
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
		Person[] arr = {new Person("zhang",11),new Person("li",12),new Person("wang",10)};
		 MyArrays.sort(arr, (obj1,obj2)->(obj1.getAge()-obj2.getAge()));
		 System.out.println(Arrays.toString(arr));


	}
}
