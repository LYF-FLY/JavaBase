import java.util.Scanner;

class Demo1 //����
{
	public static void add()//�����ú���
	{
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1+num2);
	}

	public static void main(String[] args) //������
	{
		//�����������ĺ�
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
		return 2;//�����з���ֵ
	}
	

	public static void main(String[] args)
	{
		System.out.println("hello");
		int m=11, n=66;
		//swap();
	}

}


class Demo3//������ʹ��
{
	public static void juxing(int chang, int kuan)
	{
		for(int i=1; i<=chang; i++) //һ���ж����У��г�
		{
			for(int j=1; j<=kuan; j++)//ÿ���ж�����
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

class Demo4//��������,��ͬһ��class��ģ�����ֻ����������������ֵ������ֵ���Ͳ�ͬ�������ء�
{
	public static int add()
	{
		return 3��
		
	}


	public static void main(String[] args)
	{
		System.out.println("hello");
	}
}
