/*
设计一个剪刀石头布的小游戏
     1. 用户从控制台输入选择: 1. 剪刀  2. 石头 3. 布
     2. 随机生成一个系统的选择
     3. 输出判定结果
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

	//1. 用户从控制台输入选择: 1. 剪刀  2. 石头 3. 布
	public static int userInput()throws ChoiceException
	{
		Scanner scanner = new Scanner(System.in);

      try{

			System.out.println("请输入你的选择 1. 剪刀  2. 石头 3. 布");
			int choice=scanner.nextInt();
			if(choice<1 || choice>3)
				throw new ChoiceException("输入的数字不是1，2，3");

			return choice;

		}catch(InputMismatchException e)
		{
			throw new ChoiceException("输入的格式不对");
		}
	}

	// 2. 随机生成一个系统的选择
	public static int sysChoice()
	{
		Random random =  new Random();
		return random.nextInt(3)+1;
	}

	//3.根据选择的数字显示具体的1. 剪刀  2. 石头 3. 布
	public static String display(int choice)
	{
		switch(choice)
		{
			case 1:return "剪刀";
			case 2:return "石头";
			case 3:return "布";

			default:return "";
		}
	}
	//4. 输出判定结果
	public static void judge(int userChoice,int sysChoice)
	{
		System.out.println("用户的选择是:"+display(userChoice));
		System.out.println("系统的选择是:"+display(sysChoice));

		if(userChoice==1 && sysChoice==3)
			System.out.println("用户赢了");
		else if(userChoice==3 && sysChoice==1)
			System.out.println("系统赢了");
		else if(userChoice>sysChoice)
			System.out.println("用户赢了");
		else if(userChoice<sysChoice)
			System.out.println("系统赢了");
		else
			System.out.println("平局");
	}

	//5:启动游戏
	public static void start()
	{
		
		int user=0;
		int flag=1;
		while(true)
		{
			//1. 用户从控制台输入选择: 1. 剪刀  2. 石头 3. 布
			try{
				 user=userInput();

			}catch(ChoiceException e)
			{
				continue;
			}

          //随机生成一个系统的选择
          int sys=sysChoice();

          //输出判定结果
          judge(user,sys);

          //询问用户是否继续
          System.out.println("继续吗？ 不继续输入0，否则输入1");
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
