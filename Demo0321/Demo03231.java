import java.util.Scanner;

class Demo1 //方法
{
	public static void add()//被调用函数
	{
		System.out.println("请输入两个数");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1+num2);
	}

	public static void main(String[] args) //主函数
	{
		//求两个整数的和
		add();
	}
}

class Demo2
{
	public static int fun(int a, int b)
	{
		if(a>=b)
			return 1;
		else 
		return 2;//必须有返回值
	}
	

	public static void main(String[] args)
	{
		System.out.println("hello");
		int m=11, n=66;
		//swap();
	}

}


class Demo3//函数的使用
{
	public static void juxing(int chang, int kuan)
	{
		for(int i=1; i<=chang; i++) //一共有多少行，列长
		{
			for(int j=1; j<=kuan; j++)//每行有多少列
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args)
	{
		juxing(9,4);
	}
}

class Demo4//函数重载,在同一个class里的，重载只看参数，不看返回值，返回值类型不同不是重载。
{
	public static int add()
	{
		return 3；
		
	}


	public static void main(String[] args)
	{
		System.out.println("hello");
	}
}
