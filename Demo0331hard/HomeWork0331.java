//Test Demo Test 构造方法在实例化的时候执行
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
		//这里有一个父类的super（）先执行；
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
		//调用子类方法
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
//BC2 应该是BC5 在构造函数里的成员变量是父类的，自己定义的属于自己的
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
//ADE  D不行返回值不兼容
//class Demo
//{
//	 int show(int a,int b)
//	 {
//                       return 0;
//                  }
//}
//下面那些函数可以存在于Demo的子类中。
//	
//A.public int show(int a,int b){return 0;}  重写
//
//B.private int show(int a,int b){return 0;}  权限不能小于父类
//
//C.private int show(int a,long b){return 0;}  可以 重载
//
//D.public short show(int a,int b){return 0;} 不能 既不是重写也不是重载
//
//E.static int show(int a,int b){return 0;}不能 既不是重写也不是重载
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
		System.out.println(f.num); //用的父类的变量，因为只有非静态成员函数可以重写
		System.out.println(z.num); 
		f.show();//用的子类重写的成员函数
		z.show();
	}
}
//2  编译不通过 没有空的构造函数
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
	public long get()//编译出错 既不是重写也不是重载
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
假如我们在开发一个系统时需要对员工进行建模，员工包含 3 个属性：
姓名、工号以及工资。经理也是员工，除了含有员工的属性外，另为还有一个
奖金属性。请使用继承的思想设计出员工类和经理类。要求类中提供必要的方
法进行属性访问。
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
	{         //补全程序代码 把半径大的那个圆对象返回
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
			System.out.println("圆1的半径比较大");
		else
			System.out.println("圆2的半径比较大");
	}
}