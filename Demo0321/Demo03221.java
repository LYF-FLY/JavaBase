import java.util.Scanner;
import java.util.Random ;


class Demo1//wan
{
	public static void main(String[] args) 
	{
		for (int i=0; i<3 ; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}


		System.out.println("Hello World!");
	}
}

class Demo2//3000米的绳子什么时候小于5米
{

	public static void main(String[] args)
	{
		int count = 1, n=3000;
		while(n >5)
		{
			n/=2;
			count++;
		}
		
		System.out.println(count);
	}

}

class Demo3//各个位数的和
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个正整数");
			int num = sc.nextInt();

			int sum  = 0;

			while(num!=0)
			{
				sum = sum + num%10;
				num/=10;
			}

			System.out.println(sum);
		}
}

class Demo4 //猜随机数
{

	public static void main(String[] args)
	{
		int random, guess;
		Random ran = new Random();
		random = ran.nextInt(10) + 1;
		System.out.println(random);

		
		do
		{
			System.out.println("请输入一个1-10数字");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();

			if(random>guess)
				System.out.println("偏小");
			if(random<guess)
				System.out.println("偏大");

			
		}while(guess != random);

			System.out.println("猜对了");
		

	}
}
class Demo5//求一个数的二进制
{

	public static void main(String[] args)
	{

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
		
			String str = "";
		while(num != 0)
		{
			str = num%2 + str;
			num/=2l	;	
		}
			System.out.println(str);
	}
}

class Demo6//判断回文数
{

	public static void main(String[] args)
	{
		System.out.println("请输入一个整数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int s = num, sum = 0;
		while(s != 0)
		{
			sum = sum*10 + s%10;
			s/=10;
		}

		if(sum==num)
			System.out.println(num + "是回文数");
		else
			System.out.println(num + "不是回文数");

	}
}
