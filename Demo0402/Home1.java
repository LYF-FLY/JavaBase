import java.util.*;
class Home1 
{
	public static void main(String[] args) 
	{
		//System.out.println(sum());

		//getChar(null,'d')

		String ss = generate(7);
		System.out.println(ss);
	}

	//1.设计一个方法，计算从控制台输入的两个数字的和，并处理输入的时候的异常
	public static int sum()
	{
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第一个数");
			int num1=sc.nextInt();

			System.out.println("请输入第二个数");
			int num2=sc.nextInt();

			return num1+num2;

		}catch(InputMismatchException e)
		{
			e.printStackTrace();
			return -1;
		}

	}

	/*
     在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，
	 如果存在，则返回这个字符在字符数组中第一次出现的位置（序号从0开始计算），
	 否则，返回-1。要搜索的字符数组和字符都以参数形式传递传递给该方法，
	 如果传入的数组为null，应抛出IllegalArgumentException异常。
	 在类的main方法中以各种可能出现的情况测试验证该方法编写得是否正确，
	 例如，字符不存在，字符存在，传入的数组为null等。
     getIndex(null,'a');

	*/

	public static int getChar(char[] arr,char ch)
	{
		if(arr==null)
			throw new IllegalArgumentException();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
				return i;
		}
		return -1;
	}

	//给定一个长度，生成一个指定长度的字符串，
	//这个字符串由随机的字母、数字或下划线组成。(不用必须同时包含字母、数字、下划线)  使用Random生成随机数
	public static String generate(int length)
	{
		String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

        Random  random = new Random();

        String str="";
		for(int i=1;i<=length;i++)
		{
		    str=str.concat(String.valueOf(data.charAt(random.nextInt(data.length()))));
		}
		return str;      

	}

}
