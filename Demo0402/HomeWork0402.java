/*
1.���һ������������ӿ���̨������������ֵĺͣ������������ʱ����쳣


2. ��һ�����б�дһ�������������������һ���ַ��������Ƿ����ĳ���ַ���������ڣ��򷵻�����ַ����ַ������е�һ�γ��ֵ�λ�ã���Ŵ�0��ʼ���㣩�����򣬷���-1��Ҫ�������ַ�������ַ����Բ�����ʽ���ݴ��ݸ��÷�����������������Ϊnull��Ӧ�׳�IllegalArgumentException�쳣�������main�������Ը��ֿ��ܳ��ֵ����������֤�÷�����д���Ƿ���ȷ�����磬�ַ������ڣ��ַ����ڣ����������Ϊnull�ȡ�
getIndex(null,'a');


3.С��ȥ����Է������ϴ���22��Ǯ���������[15, 30]��Χ�ķ�Ǯ�����С����Ǯ����֧����Ǯ���׳�һ�� NotEnoughMoneyException������ʱ�쳣��ʹ��Random���������,  import  java.util.Random;

������ɷ�Ǯ
Random random = new Random();
int cost = random.nextInt(16) + 15;




4. ����һ�����ȣ�����һ��ָ�����ȵ��ַ���������ַ������������ĸ�����ֻ��»�����ɡ�(���ñ���ͬʱ������ĸ�����֡��»���)  ʹ��Random���������

*/
import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Demo1 
{
	public static void add() 
	{
		System.out.println("�������һ����");
		Scanner sc = new Scanner(System.in);
		int a =0;
		try{
			  a= sc.nextInt();
		}catch(Exception e)
		{
			String msg = e.getMessage();
			System.out.println(msg);
		}
		

		System.out.println("������ڶ�����");
		int b = 0;
		try{
			  b = sc.nextInt();
		}catch(Exception e)
		{
			String msg = e.getMessage();
			System.out.println(msg);
		}

		System.out.println("����"+(a+b));
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
			System.out.println("��ָ��");
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