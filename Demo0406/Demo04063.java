class  Demo1
{
	public static void func()
	{
		try
		{
		           throw  new Exception(); //û��catch�ͱ��벻ͨ��
		}
		catch(Exception e)  
		{
			
		}
		finally
		{
			System.out.println("B");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			func(); 
			System.out.println("A");
		}
		catch(Exception e)
		{
			System.out.println("C");
		}
		System.out.println("D");
	}
}

class  Demo2 //bcd
{
	public static void main(String[] args)
	{
		try
		{
			showExce();
			System.out.println("A");
		}
		catch(Exception e)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");
	}

	public static void showExce()throws Exception 
	{
		throw new Exception();
	}
}
class  Demo3 //bd
{
	public static void func()
	{
		try
		{
			throw  new Exception();
			System.out.println("A"); // ����: �޷����ʵ����System.out.println("A")
		}
		catch(Exception e)
		{
			System.out.println("B");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			func();
		}
		catch(Exception e)
		{
			System.out.println("C");
		}
		System.out.println("D");
	}
}

class Exc0 extends Exception{}
class Exc1 extends Exc0{}

class Demo4 //����catch �����쳣Ҫд�ڸ����쳣֮ǰ
{
	public static void main(String[] args)
	{
		try
		{
			throw new Exc1();
		}		
		//catch(Exception e)		
		//{
		//	System.out.println("Exception");
		//}
		catch(Exc0 e)
		{
			System.out.println("Exc0");
		}
	}
}

class Demo5  //134 13423
{
	public static String output=""; 

	public static void foo(int i)
	{ 
		try
		{ 
			if(i==1)
			     throw new Exception(); 	
			output+="1";   
		} 
		catch(Exception e)
		{ 
			output+="2";   
			return; 
		} 
		finally
		{ 
			output+="3"; 
		} 
		output+="4"; 
	}
	public static void main(String args[])
	{ 
		foo(0);
		System.out.println(output);

		foo(1); 
		System.out.println(output);  
	}
}

class Circle
{	
	private double radius;
	public Circle(double r)
	{
		radius=r;
	}
	public Circle compare(Circle cir)
	{
		if(this.radius > cir.radius) 
	   return this;
	   else
		   return cir;
		
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