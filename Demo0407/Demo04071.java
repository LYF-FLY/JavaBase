//lambda���ʽʵ�ֽӿ�,�ѷ�����ʡ�ˣ�ǰ���ǽӿ�������ֻ��һ�����뱻��д�ķ���
interface inter
{
	void test();
}
class  Demo1
{
	public static void main(String[] args) 
	{
		//�����ڲ���ʵ�ֽӿ�
		inter in = new inter(){
			public void test()
			{
				System.out.println("Hello World!");
			}
		};
		//�ӿ���ֻ��һ���������������ӿ��еķ�����ʡ����
		inter in2 =()->{System.out.println("Hello World!");};
		
	}
}

//�﷨ ()->{} ʵ�ֵĺ���ʽ�ӿ�
//@FunctinalInterface //�ж��ǲ��Ǻ���ʽ�ӿڣ����ǻᱨ��
interface test1 //��
{
	void show();
}
interface test2 //����
{
	void show();
	void fun();
}
interface test3 extends test1 //yes
{
}
interface test4 //��
{
	void show();
	static void ff() //
	{
		System.out.println("Hello World!");
	}
}
interface test5 //��
{
	void show();//���뱻��д
	String toString(); //���Ǳ��뱻��д��obj�Ѿ�ʵ���ˣ�������д����д������
}
interface test6 //��
{
	void show();//���뱻��д
	default void fun()
	{
		
	}//�Ѿ�ʵ�ֲ��Ǳ��뱻��д
}
interface test7 //����
{
	
}


class Demo2
{
	public static void main(String[] args)
	{
		
	}
}
//=================================== lambdaʹ�÷���
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
		//�����������ֻ��һ��������䣬�����ź�returnͬʱʡ
		//returnOnePara returnonepara = (int a)->return 1; ����
		returnOnePara returnonepara2 = a->1;
		//������ֻ��һ������ſ���ʡ�ԣ�����return����
		//noreturnOnePara noreturnonepara2 = (int a)->return 1;
		noreturnOnePara noreturnonepara2 = (int a)->System.out.println("hhhh");
		noreturnonepara2.fun(1);	
		//���ֻ��һ����������С���ź����Ϳ�ʡ
		noreturnOnePara noreturnonepara3 =  a->System.out.println("hhhh");
		//��������������������Ϳ���ʡ�ԣ�����ͬʱʡ�ԣ�С���Ų���ʡ��
		

	}
}
//lambda�ľ�̬�������ã�����ʽ�ӿ��еķ����Ĳ����ͷ���ֵ�����еľ�̬������������ֵһ��
//lambda�ķǾ�̬�������ã�����ʽ�ӿ��еķ����Ĳ����ͷ���ֵ�����еľ�̬������������ֵһ��
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
//lambda���췽������
class Test
{
	int test(int a, int b)
		{
			return a*b;
		}
}

