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
class Test5//һ����λ���֣�ǡ�ɵ���ȥ������λ����֮����ʣ����λ���ֵ�3���������λ�����Ƕ���
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
class Test6// �� 2 + 22 + 222 + 2222 + 22222 + ... + 2...2�ĺͣ����ֵ������ɿ���̨��
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
class Test7//���쳲��������е�ǰ30λ           1   1   2  3  5  8  13  21  34   55   89 .......

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
		System.out.println("����������Ҫ�ĵڼ���");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}
}
class Test8//5.������Ȼ���������3��10�����������������̡������ĺ���163���󱻳�����������
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
class Test9//6.ĳ��ѧ�����У�����������Լ��380~450��֮�䡣���������ȫ�忼������ƽ����Ϊ76�֣�������ƽ����Ϊ75�֣�Ů����ƽ����Ϊ80.1�֣�����Ů�����ж����ˣ�

{

	public static void main(String[] args)
	{
		for (int count=380; count<=450; count++)
		{
			for (int male=1; male<=450; male++)
			{
				if( ((male*75)+((count-male)*80.1))/count==76)
					
					System.out.println("����������"+male+"Ů��������"+(count-male));					
			}
		}
	}
}
class Test10//7.�ӿ���̨��������Ӣ����ĸ�����������Ӣ����ĸ֮������е���ĸ
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("������������ĸ");
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
