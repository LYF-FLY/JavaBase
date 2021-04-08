/*
���һ������ʯͷ����С��Ϸ
     1. �û��ӿ���̨����ѡ��: 1. ����  2. ʯͷ 3. ��
     2. �������һ��ϵͳ��ѡ��
     3. ����ж����
*/
import java.util.*;
class Home1 
{
	public static void main(String[] args) 
	{
		Game.start();
	}
}
class Game
{

	//1. �û��ӿ���̨����ѡ��: 1. ����  2. ʯͷ 3. ��
	public static int userInput()throws ChoiceException
	{
		Scanner scanner = new Scanner(System.in);

      try{

			System.out.println("���������ѡ�� 1. ����  2. ʯͷ 3. ��");
			int choice=scanner.nextInt();
			if(choice<1 || choice>3)
				throw new ChoiceException("��������ֲ���1��2��3");

			return choice;

		}catch(InputMismatchException e)
		{
			throw new ChoiceException("����ĸ�ʽ����");
		}
	}

	// 2. �������һ��ϵͳ��ѡ��
	public static int sysChoice()
	{
		Random random =  new Random();
		return random.nextInt(3)+1;
	}

	//3.����ѡ���������ʾ�����1. ����  2. ʯͷ 3. ��
	public static String display(int choice)
	{
		switch(choice)
		{
			case 1:return "����";
			case 2:return "ʯͷ";
			case 3:return "��";

			default:return "";
		}
	}
	//4. ����ж����
	public static void judge(int userChoice,int sysChoice)
	{
		System.out.println("�û���ѡ����:"+display(userChoice));
		System.out.println("ϵͳ��ѡ����:"+display(sysChoice));

		if(userChoice==1 && sysChoice==3)
			System.out.println("�û�Ӯ��");
		else if(userChoice==3 && sysChoice==1)
			System.out.println("ϵͳӮ��");
		else if(userChoice>sysChoice)
			System.out.println("�û�Ӯ��");
		else if(userChoice<sysChoice)
			System.out.println("ϵͳӮ��");
		else
			System.out.println("ƽ��");
	}

	//5:������Ϸ
	public static void start()
	{
		
		int user=0;
		int flag=1;
		while(true)
		{
			//1. �û��ӿ���̨����ѡ��: 1. ����  2. ʯͷ 3. ��
			try{
				 user=userInput();

			}catch(ChoiceException e)
			{
				continue;
			}

          //�������һ��ϵͳ��ѡ��
          int sys=sysChoice();

          //����ж����
          judge(user,sys);

          //ѯ���û��Ƿ����
          System.out.println("������ ����������0����������1");
		  Scanner sc=new Scanner(System.in);
		  flag = sc.nextInt();

		  if(flag==0)
			  break;
		}

	}
}
class ChoiceException extends Exception
{
	ChoiceException(){}

	ChoiceException(String message)
	{
		super(message);
	}
}
