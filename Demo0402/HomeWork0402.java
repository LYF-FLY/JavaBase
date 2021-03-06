/*
1.设计一个方法，计算从控制台输入的两个数字的和，并处理输入的时候的异常


2. 在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，如果存在，则返回这个字符在字符数组中第一次出现的位置（序号从0开始计算），否则，返回-1。要搜索的字符数组和字符都以参数形式传递传递给该方法，如果传入的数组为null，应抛出IllegalArgumentException异常。在类的main方法中以各种可能出现的情况测试验证该方法编写得是否正确，例如，字符不存在，字符存在，传入的数组为null等。
getIndex(null,'a');


3.小明去饭店吃饭，身上带了22块钱，随机产生[15, 30]范围的饭钱，如果小明的钱不够支付饭钱，抛出一个 NotEnoughMoneyException的运行时异常。使用Random产生随机数,  import  java.util.Random;

随机生成饭钱
Random random = new Random();
int cost = random.nextInt(16) + 15;




4. 给定一个长度，生成一个指定长度的字符串，这个字符串由随机的字母、数字或下划线组成。(不用必须同时包含字母、数字、下划线)  使用Random生成随机数

*/
import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Demo1 
{
	public static void add() 
	{
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int a =0;
		try{
			  a= sc.nextInt();
		}catch(Exception e)
		{
			String msg = e.getMessage();
			System.out.println(msg);
		}
		

		System.out.println("请输入第二个数");
		int b = 0;
		try{
			  b = sc.nextInt();
		}catch(Exception e)
		{
			String msg = e.getMessage();
			System.out.println(msg);
		}

		System.out.println("和是"+(a+b));
	}

	public static void main(String[] args) 
	{
		add();
		System.out.println("Hello World!");
	}
}

class Demo2
{
	public static int getIndex(char[] arr, char ch) throws IllegalArgumentException
	{
		int index = -1;

		if(arr == null)
		{
			System.out.println("空指针");
			throw new IllegalArgumentException();
		}
			

		for (int i=0; i<arr.length; i++)
		{
			if(arr[i] == ch)
			{
				index = i;
				break;
			}				
		}
		return index;
	}
	public static void main(String[] args) throws IllegalArgumentException
	{
		char[] arr = null;
		System.out.println(getIndex(arr, 'a'));
	}
}

class Demo3
{
	public static void main(String[] args) throws NotEnoughMoneyException
	{
		int n = 22;
		Random random = new Random();
		int cost = random.nextInt(16)+15;
		System.out.println(cost);

		if(n < cost)
			throw new NotEnoughMoneyException();
	}
}

class NotEnoughMoneyException extends Exception
{
	NotEnoughMoneyException(){}

	NotEnoughMoneyException(String message)
		{
			super(message);
		}

}

class Demo4
{
	public static String getRandomString(int len)
	{
		String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPSADFGHJKLZXCVBNM1234567890_";
		StringBuffer s = new StringBuffer();
		Random ran = new Random();
		for (int i=0; i<len; i++)
		{
			int n = ran.nextInt(63);
			s.append(str.charAt(n));
		}
		
		return s.toString();

	}
	public static void main(String[] args)
	{
		System.out.println(getRandomString(10));
	}
}