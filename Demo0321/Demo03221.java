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

class Demo2//3000�׵�����ʲôʱ��С��5��
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

class Demo3//����λ���ĺ�
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ��������");
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

class Demo4 //�������
{

	public static void main(String[] args)
	{
		int random, guess;
		Random ran = new Random();
		random = ran.nextInt(10) + 1;
		System.out.println(random);

		
		do
		{
			System.out.println("������һ��1-10����");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();

			if(random>guess)
				System.out.println("ƫС");
			if(random<guess)
				System.out.println("ƫ��");

			
		}while(guess != random);

			System.out.println("�¶���");
		

	}
}
class Demo5//��һ�����Ķ�����
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

class Demo6//�жϻ�����
{

	public static void main(String[] args)
	{
		System.out.println("������һ������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int s = num, sum = 0;
		while(s != 0)
		{
			sum = sum*10 + s%10;
			s/=10;
		}

		if(sum==num)
			System.out.println(num + "�ǻ�����");
		else
			System.out.println(num + "���ǻ�����");

	}
}
