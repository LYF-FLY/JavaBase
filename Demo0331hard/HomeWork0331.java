//Test Demo Test ���췽����ʵ������ʱ��ִ��
class Test  
{
	Test()
	{                      
	   System.out.println("Test");
	}
}
class Demo1 extends Test
{
	Demo1()
	{   
		//������һ�������super������ִ�У�
       System.out.println("Demo");
	}

	public static void main(String[] args)
	{
		new Demo1();   
		new Test();  
	}
}
//AB
class Fu
{
	boolean show(char a)
	{
		System.out.println(a);
		return true;
	}
}
class Demo2 extends Fu
{
	public static void main(String[] args)
	{
		int i=0;
		Fu f=new Demo();

		Demo d=new Demo();
		//�������෽��
		for(f.show('A'); f.show('B')&&(i<2);f.show('C'))
		{
			i++;
			d.show('D');
		}	
	}
	boolean show(char a)
	{
		System.out.println(a);
		return false;
	}
}
//BC2 Ӧ����BC5 �ڹ��캯����ĳ�Ա�����Ǹ���ģ��Լ�����������Լ���
class Super
{
	int i=0;
	public Super(String a)
	{
		System.out.println("A");
		i=1;	
	}
	public Super()
	{
		System.out.println("B");
		i+=2;
	}
}
class Demo3 extends Super
{
	public Demo3(String a)
	{
	
		System.out.println("C");
		i=5;				
	}
	public static void main(String[] args)
	{
		int i=4;
		Super d=new Demo3("A"); 
		System.out.println(d.i); 
	}
}
//ADE  D���з���ֵ������
//class Demo
//{
//	 int show(int a,int b)
//	 {
//                       return 0;
//                  }
//}
//������Щ�������Դ�����Demo�������С�
//	
//A.public int show(int a,int b){return 0;}  ��д
//
//B.private int show(int a,int b){return 0;}  Ȩ�޲���С�ڸ���
//
//C.private int show(int a,long b){return 0;}  ���� ����
//
//D.public short show(int a,int b){return 0;} ���� �Ȳ�����дҲ��������
//
//E.static int show(int a,int b){return 0;}���� �Ȳ�����дҲ��������
//

//45 SHOWZI4 SHOWZI4
class Fa
{
	int num=4;
	void show()
	{
		System.out.println("showFu");
	}
}
class Zi extends Fa
{
	int num=5;
	void show()
	{
	         System.out.println("showZi"+super.num);
	}
}
class T
{
	public static void main(String[] args)
	{
		Fa f=new Zi();
		Zi z=new Zi();
		System.out.println(f.num); //�õĸ���ı�������Ϊֻ�зǾ�̬��Ա����������д
		System.out.println(z.num); 
		f.show();//�õ�������д�ĳ�Ա����
		z.show();
	}
}
//2  ���벻ͨ�� û�пյĹ��캯��
class Super
{
	int i=0;	
	public Super(String s)
	{
		i=1;	
	}
}
class Demo4 extends Super
{
	public Demo4(String s)
	{
		
		i=2;			
	}
	public static void main(String[] args)
	{
		Demo4 d=new Demo4("yes");
		System.out.println(d.i);
	}
}
//5
class Super1
{
	public int get()
	{return 4;}
}
class Demo15 extends Super1
{
	public long get()//������� �Ȳ�����дҲ��������
	{return 5;}
	
	public static void main(String[] args)
	{
		Super1 s=new Demo15();
		System.out.println(s.get());
	}
}
//4
public class Demo6
{     
	private static int j = 0; 

	private static boolean methodB(int k)
	{
		j += k;
		return true; 
	}

	public static void methodA(int  i)
	{ 
        	                boolean b;   
		b = i < 10 | methodB (4); 
		b = i < 10 || methodB (8); 
	}

	public static void main (String args[] )
	{
		methodA (0); 
		System.out.println(j);
	} 
}
/*
���������ڿ���һ��ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������ 3 �����ԣ�
�����������Լ����ʡ�����Ҳ��Ա�������˺���Ա���������⣬��Ϊ����һ��
�������ԡ���ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ�
���������Է��ʡ�
*/
class YuanGong
{
	private String name;
	private int num;
	private int salary;

	YuanGong(){}
	YuanGong(String name, int num, int salary)
	{
		this.name = name;
		this.num = num;
		this.salary = salary;
	}
}
class JingLi extends YuanGong
{
	private int jiangjin;

	JingLi(){}
	JingLi(String name, int num, int salary, int JiangJin)
	{
		super(name, num, salary);
		this.JiangJin = Jiangjin;
	}

}
//
class Circle
{	
	private double radius;

	public Circle(double r)
	{
		radius=r;
	}

	public Circle compare(Circle cir)
	{         //��ȫ������� �Ѱ뾶����Ǹ�Բ���󷵻�
		return this.radius>cir.radius?this:cir;
	}
}
class TC
{
	public static void main(String[] args)
	{
		Circle cir1=new Circle(1.0);
		Circle cir2=new Circle(2.0);

		Circle cir;
		cir=cir1.compare(cir2);

		if(cir1==cir)
			System.out.println("Բ1�İ뾶�Ƚϴ�");
		else
			System.out.println("Բ2�İ뾶�Ƚϴ�");
	}
}