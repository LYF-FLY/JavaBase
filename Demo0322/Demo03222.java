import java.util.Scanner;
class Demo1//ѭ���Ĳ���
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
class Demo2//Ƕ��ѭ��
{
//*
//**
//***
//****
//*****

	public static void main(String[] args)
	{
		for(int j=1; j<=5; j++)//��ѭ��,��������
		{
				for (int i=0; i<j; i++)//��ѭ��������ÿһ�е�����
			{
				System.out.print("*");
			}
				System.out.println();
		}

		
		
	}
}

class Demo3//Ƕ��ѭ��
{
//****
//***
//**
//*

	public static void main(String[] args)
	{
		for(int j=1; j<=5; j++)//��ѭ��,��������
		{
				for (int i=5; i>=j; i--)//��ѭ��������ÿһ�е�����
			{
				System.out.print("*");
			}
				System.out.println();
		}

		
		
	}
}
class Demo4//�žų˷�
{

	public static void main(String[] args)
	{
		for(int j=1; j<=9; j++)//��ѭ��,��������
		{
				for (int i=1; i<=j; i++)//��ѭ��������ÿһ�е�����
			{
				System.out.print(i+"*"+j+"="+j*i+"\t");
			}
				System.out.println();
		}

	}
}
class Demo5 //ʵ������
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
class Demo6 //��������
{

	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=4-i; j++) //��ӡ����һ���ո�
			{
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++)//��ӡһ����������
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
class Demo8//����10������� ��������999����
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i=1; i<=10;i++)
		{
			System.out.println("�����"+i+"����");

			int num = sc.nextInt();

			if (num ==999)
			 break;
			sum += num;
		}

		System.out.println("����"+sum);
	}
}
