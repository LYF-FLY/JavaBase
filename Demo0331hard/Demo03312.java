//�ڲ��࣬�����ڲ��������,��Ա�ͳ�Ա֮�����ֱ��ʹ��
//�ڲ������о�̬��Ա���ڲ�������Ǿ�̬��

class Outer
{
	private  int num = 77;
	class Inner
	{
		int num = 66;
		public  void show()
		{
			int num = 99;
			//this.num  Outer.this.num ͬ��������ڲ�������ⲿ���Ա
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
		//�����ڲ������
		Outer.Inner in = new Outer().new Inner();
		in.show();

		//���þ�̬�ڲ���ķǾ�̬����
		//Outer.Inner in2 = new Outer.Inner();
		//in2.show();
		//���þ�̬�ڲ���ľ�̬������
		//Outer.Inner.show();

		//���÷Ǿ�̬�ڲ���ľ�̬�������У�û��Ҫ-
		
		
	}
} 


/*
�����ڲ���
�����и�������ã������ִֻ��һ�ε���ʹ�ã�����һ����Ķ���
���ʺϷ���̫��
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
		//������test���������,ͨ��������÷������ȼ���������ڲ���̳и���
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
		//��̬ ����ָ���������
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

//ʹ�������ڲ���
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