//lambda表达式实现接口,把方法名省了，前提是接口中有且只有一个必须被重写的方法
interface inter
{
	void test();
}
class  Demo1
{
	public static void main(String[] args) 
	{
		//匿名内部类实现接口
		inter in = new inter(){
			public void test()
			{
				System.out.println("Hello World!");
			}
		};
		//接口中只有一个方法，所以连接口中的方法都省略了
		inter in2 =()->{System.out.println("Hello World!");};
		
	}
}

//语法 ()->{} 实现的函数式接口
//@FunctinalInterface //判断是不是函数式接口，不是会报错
interface test1 //是
{
	void show();
}
interface test2 //不是
{
	void show();
	void fun();
}
interface test3 extends test1 //yes
{
}
interface test4 //是
{
	void show();
	static void ff() //
	{
		System.out.println("Hello World!");
	}
}
interface test5 //是
{
	void show();//必须被重写
	String toString(); //不是必须被重写，obj已经实现了，子类重写不重写都可以
}
interface test6 //是
{
	void show();//必须被重写
	default void fun()
	{
		
	}//已经实现不是必须被重写
}
interface test7 //不是
{
	
}


class Demo2
{
	public static void main(String[] args)
	{
		
	}
}
//=================================== lambda使用方法
interface returnOnePara
{
	int fun(int a);
}
interface noreturnOnePara
{
	void fun(int a);
}
class Demo3
{
	public static void main(String[] args)
	{
		returnOnePara returnonepara = (int a)->{return 1;};
		System.out.println(returnonepara.fun(1));
		//如果大括号中只有一条返回语句，大括号和return同时省
		//returnOnePara returnonepara = (int a)->return 1; 不行
		returnOnePara returnonepara2 = a->1;
		//大括号只有一句大括号可以省略，但是return不行
		//noreturnOnePara noreturnonepara2 = (int a)->return 1;
		noreturnOnePara noreturnonepara2 = (int a)->System.out.println("hhhh");
		noreturnonepara2.fun(1);	
		//如果只有一个参数，则小括号和类型可省
		noreturnOnePara noreturnonepara3 =  a->System.out.println("hhhh");
		//如果两个参数，数据类型可以省略，必须同时省略，小括号不能省略
		

	}
}
//lambda的静态方法引用：函数式接口中的方法的参数和返回值和类中的静态方法参数返回值一样
//lambda的非静态方法引用：函数式接口中的方法的参数和返回值和类中的静态方法参数返回值一样
class Demo4
{
	public static void main(String[] args)
	{
		inter4 in  =  Calculater::calculate;
		inter4 in2 = new Calculater()::calculate2;
		inter4 in3 = Calculater::new;
		System.out.println(in.fun(2,3));
		System.out.println(in2.fun(2,3));
		System.out.println(in3.fun(2,3));

	}
}
class Calculater
{
	int Calculater(int a, int b)
		{
			return a*b;
		}
	public static int calculate(int m, int n)
	{
		return m *n;
	}
	public  int calculate2(int m, int n)
	{
		return m *n;
	}
}
interface inter4
{
	int fun(int a, int b);
}
//lambda构造方法引用
class Test
{
	int test(int a, int b)
		{
			return a*b;
		}
}

