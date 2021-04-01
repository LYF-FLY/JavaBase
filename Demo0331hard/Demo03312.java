//内部类，在类内部定义的类,成员和成员之间可以直接使用
//内部类内有静态成员，内部类必须是静态的

class Outer
{
	private  int num = 77;
	class Inner
	{
		int num = 66;
		public  void show()
		{
			int num = 99;
			//this.num  Outer.this.num 同名情况下内部类访问外部类成员
			System.out.println(num);
		}

	}
	public void fun()
	{
		Inner in = new Inner();
		in.show();

	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		//Outer out = new Outer();
		//创建内部类对象
		Outer.Inner in = new Outer().new Inner();
		in.show();

		//调用静态内部类的非静态方法
		//Outer.Inner in2 = new Outer.Inner();
		//in2.show();
		//调用静态内部类的静态方法行
		//Outer.Inner.show();

		//调用非静态内部类的静态方法不行，没必要-
		
		
	}
} 


/*
匿名内部类
必须有父类才能用，最好是只执行一次的类使用，减少一个类的定义
不适合方法太多
*/
abstract class Test
{
	public abstract void show();
}
class Outer1
{
	//class Inner extends Test
	//{
	//	public void show()
	//	{
	//		System.out.println("hhhh");
	//	}
	//	public void fun()
	//	{
	//		System.out.println("fun");
	//	}
	//}
	public void ff()
	{
		//Innner in = new Inner();
		//in.show();
		//in.fun();
		//创建了test的子类对象,通过对象调用方法，等价于上面的内部类继承父类
		new Test()
		{
				public void show()
			{
				System.out.println("hhhh");
			}
			public void fun()
			{
				System.out.println("fun");
			}
		}.show();
		//多态 父类指向子类对象
		Test test = new Test()
		{
				public void show()
			{
				System.out.println("hhhh");
			}
			public void fun()
			{
				System.out.println("fun");
			}
		};
	}
}
class Demo2
{
	
	public static void main(String[] args)
	{
		Outer1 out = new Outer1();
		out.ff();
	}
}

//使用匿名内部类
class Test1
{
	public static inter method()
	{
		return new inter(){
			public void show()
			{
				System.out.println("ahhaha");
			}
			};
	}
}
interface inter
{
	public abstract void show();
}
class Demo3
{
	public static void main(String[] args)
	{
		Test1.method().show();//new inter(){public void show(){}}.show();
	}
}