import java.util.Scanner;
class Test1 
/*
*****                *********             ABCDE                              EFGHI
 *****	        *******                  BCDEF                         DEFGH
  *****                 *****                      CDEFG                   CDEFG
   *****                  ***                          DEFGH             BCDEF
    *****                  *                               EFGHI         ABCDE
*/
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}
}
class Test2
{

	public static void main(String[] args)
	{
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<i; j++ )
			{
				System.out.print(" ");
			}
			for (int j=1; j<=9-2*i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
class Test3
{

	public static void main(String[] args)
	{
		char ch = 65;
		for (int i=0; i<5; i++)
		{
			char ch2=ch;
			for (int j=0; j<i; j++ )
			{
				System.out.print(" ");
			}
			for (int j=0; j<5; j++)
			{
				
				System.out.print(ch2);
				ch2 ++;
			}
			ch++;
			System.out.println();

		}
		
	}
}

class Test4
{

	public static void main(String[] args)
	{
		char ch = 69;
		for (int i=0; i<5; i++)
		{
			char ch2=ch;
			for (int j=0; j<4-i; j++ )
			{
				System.out.print(" ");
			}
			for (int j=0; j<5; j++)
			{
				
				System.out.print(ch2);
				ch2 ++;
			}
			ch--;
			System.out.println();

		}
		
	}
}
class Test5//一个四位数字，恰巧等于去掉它首位数字之后所剩的三位数字的3倍，这个四位数字是多少
{

	public static void main(String[] args)
	{
		for (int i=1000; i<=3000; i++)
		{
			if(i==(i%1000)*3)
			System.out.println(i);
		}
	}
}
class Test6// 求 2 + 22 + 222 + 2222 + 22222 + ... + 2...2的和，数字的数量由控制台输
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, sum1=0;
		
			for (int j=0; j<num; j++)
			{
				sum1 = sum1*10+2;
				sum += sum1;
				System.out.print(sum1);
			if(j<num-1)
				System.out.print("+");
			}
			
			
			

		
		System.out.println("="+sum);

	}
}
class Test7//输出斐波那契数列的前30位           1   1   2  3  5  8  13  21  34   55   89 .......

{
	public static int fibo(int n)
	{
		int num=0;
		if(n==1 || n==2)
			num = 1;
		else
			num = fibo(n-1)+fibo(n-2);
		return num;
	}

	public static void main(String[] args)
	{
		System.out.println("请输入你想要的第几项");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}
}
class Test8//5.两个自然数相除，商3余10，被除数、除数、商、余数的和是163，求被除数、除数。
{

	public static void main(String[] args)
	{
		for(int i=0; i<=150; i++)
		{
			for (int j= 1; j<=150; j++)
			{
				if(i/j==3 && i%j==10 && i+j==150)
					System.out.println("i="+i+"j="+j);
			}
		}
	}
}
class Test9//6.某数学竞赛中，参赛人数大约在380~450人之间。比赛结果，全体考生的总平均分为76分，男生的平均分为75分，女生的平均分为80.1分，求男女生各有多少人？

{

	public static void main(String[] args)
	{
		for (int count=380; count<=450; count++)
		{
			for (int male=1; male<=450; male++)
			{
				if( ((male*75)+((count-male)*80.1))/count==76)
					
					System.out.println("男生人数是"+male+"女生人数是"+(count-male));					
			}
		}
	}
}
class Test10//7.从控制台输入两个英文字母，输出这两个英文字母之间的所有的字母
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入两个字母");
		String lett =sc.next();
		char[] ch = lett.toCharArray();
		char max = ch[0]>ch[1]? ch[0]:ch[1];
		char min = ch[0]>ch[1]? ch[1]:ch[0];
		

		for (char i=min; i<=max; i++)
		{
			
			System.out.print(i);
		}

	}
}
