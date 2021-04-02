/*
编译的时候不出错，运行的时候不行，叫做异常
Java把异常面向对象了,把异常的行为和不正常情况提取属性和方法
Throwable 顶层类
	Error:表示处理不了的严重问题，不用学
	Exception:

异常处理方式
		try{
		可能发生异常的代码
		
		}catch(异常类 e)
		{
			处理异常的代码
		}

		throws 在方法后面 声明可能发生异常 必须对其进行捕获或者声明
*/
class  Demo1
{

	public static void main(String[] args) 
	{
		try{
			int[] arr = new int[3];
			//系统自动创建一个异常对象 throw new Exception() 发生异常的后面的代码没法运行，直接catch
			System.out.println(arr[3]);//main方法把异常抛给虚拟机  虚拟机调用异常对象的printStackTrace()方法
		}catch(Exception e) // 多态 Exception e = Exception e
		{
			String msg = e.getMessage();//异常信息
			System.out.println(msg);

			msg = e.toString();//异常名称，异常信息
			System.out.println(msg);

			e.printStackTrace();//异常名称，异常信息。异常位置

			System.out.println("数组越界");
		}
	}
		
	/*
	因为异常早就定义了，所以创建该异常类对象
	main方法处理不了异常把异常抛给虚拟机  虚拟机调用异常对象的printStackTrace()方法
	这个方法会打印异常的名称，异常信息，异常发生的位置，然后中断程序
	*/
}

//自定义异常 除数为负数异常
/*
用了throw 手动创建异常对象 必须对其进行处理
两种处理方式

异常分两类
非运行时异常	编译时检测的异常
			使用了throw或throws 必须处理
运行时异常	编译时不检测的异常 如Runtime和其子类，java希望异常发生的时候发生中断
			使用了throw或throws 不用处理

			都是因为数据错误造成的异常，就应该让程序停下，修改错误数据

*/
class FuShuException extends Exception
{
	FuShuException(){}
	FuShuException(String message)
	{
		super(message);
	}
}
class MyMath
{
	public int div(int a, int b)  throws FuShuException
	{
		//try{
				if(b < 0)
					throw new FuShuException();//用了throw必须对其进行处理				
		//}catch(FuShuException e)
		//{
		//	
		//}
		return a/b;
	}
}
class Demo2
{
	public static void main(String[] args) throws FuShuException
	{
		MyMath myMath = new MyMath();
		int num = myMath.div(6,-1);
	}
}

//获取一个数组中指定下标的数据 运行时异常
class  Demo3
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,4,4,5};
		getNum(arr,7);
		System.out.println("Hello World!");
	}

	public static int getNum(int[] arr, int index)
	{
		if(index < 0 || index >= arr.length)
			throw new ArrayIndexOutOfBoundsException();
		if(arr == null)
			throw new NullPointerException();
		return arr[index];
	}
}

//图形面积为负数为异常  运行时异常就继承RuntimeException
class AreaFuShuException extends RuntimeException
{
	AreaFuShuException(){}
	AreaFuShuException(String msg)
	{
		super(msg);
	}
}
class Rectangle
{
	private double length, width;

	Rectangle(){}

	Rectangle(double length, double width)
		{
			if(length<0 || width<0)
				throw new AreaFuShuException();
			this.length = length;
			this.width = width;
		}
}

class Demo5
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle(-2,9);
	}
}