/*
静态代码块，随着类的加载而执行，且只执行一次，优先于main的执行
链接数据库时使用，保证先执行且只执行一次

构造代码块：对象已创建就执行，优先于构造方法的执行

创建对象使用的是类编译以后的字节码，所以先加载字节码到方法区
如果有静态代码块会执行静态代码块
在堆中开辟内存
给属性赋默认值
给属性赋初始值（如果在类中有的话）
执行构造代码块
执行构造方法
把对象在堆中的地址赋给在栈中的变量
*/
class Test
{
	static int num = 5;

	static
		{
			System.out.println("c");
		}

	public static void show()
	{
		System.out.println(num);
	}
}
class  Demo1
{
	static
	{
		System.out.println("a");
	}

	public static void main(String[] args) 
	{
		//Test test = new Test();
		//Test.show();
		//Test test = null; 没有加载Test所以不执行静态代码块
	}

	static
	{
		System.out.println("b");
	}
}

class Person
{
	private int age = 44;

	{
		System.out.println(age;//在构造方法以前实现

	}

	public Person(int age)
	{
		this.age =age;
	}





}

class Demo2
{
	public static void main(String[] args)
	{
		Person per = new Person(18);
	}
}