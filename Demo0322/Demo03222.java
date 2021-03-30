import java.util.Scanner;
class Demo1//循环的步骤
{
	public static void main(String[] args) 
	{
		int x=1;
		for(show('a'); show('b')&&x<3; show('c'))
		{
			show('d');
			x++;
		}
	}

	public static boolean show(char ch)
	{
		System.out.println(ch);
		return true;
	}
}
class Demo2//嵌套循环
{
//*
//**
//***
//****
//*****

	public static void main(String[] args)
	{
		for(int j=1; j<=5; j++)//外循环,控制行数
		{
				for (int i=0; i<j; i++)//内循环，控制每一行的内容
			{
				System.out.print("*");
			}
				System.out.println();
		}

		
		
	}
}

class Demo3//嵌套循环
{
//****
//***
//**
//*

	public static void main(String[] args)
	{
		for(int j=1; j<=5; j++)//外循环,控制行数
		{
				for (int i=5; i>=j; i--)//内循环，控制每一行的内容
			{
				System.out.print("*");
			}
				System.out.println();
		}

		
		
	}
}
class Demo4//九九乘法
{

	public static void main(String[] args)
	{
		for(int j=1; j<=9; j++)//外循环,控制行数
		{
				for (int i=1; i<=j; i++)//内循环，控制每一行的内容
			{
				System.out.print(i+"*"+j+"="+j*i+"\t");
			}
				System.out.println();
		}

	}
}
class Demo5 //实心菱形
{

	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=7-2*i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
}
class Demo6 //空心菱形
{

	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=4-i; j++) //打印三二一个空格
			{
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++)//打印一二三个星星
			{
				if(j==1 || j==2*i-1)
					System.out.print("o");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=7-2*i; j++)
			{
				if(j==1 || j==7-2*i)
					System.out.print("o");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
				
	}
}
class Demo7
{

	public static void main(String[] args)
	{
		m:for (int i=0; i<3; i++)
		{
			n:for (int j=0; j<3; j++)
			{
				if(i==2)
					break m;

			}
			System.out.println(i);
	}
		}
		
}
class Demo8//输入10个数求和 或者输入999结束
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i=1; i<=10;i++)
		{
			System.out.println("输入第"+i+"个数");

			int num = sc.nextInt();

			if (num ==999)
			 break;
			sum += num;
		}

		System.out.println("和是"+sum);
	}
}
