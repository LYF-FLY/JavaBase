import java.util.regex.*;
import java.util.Arrays;
class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String str = "qwewer   qwer  ddfgd  sdfg";
		//获取由四个字符构成的单词
		//1、获取的内容共同符合的正则表达式
		String regex = "[a-z]{4}";
		//2、把正则表达式编译为Pattern类型的对象
		Pattern pattern =Pattern.compile(regex);
		//3.使用Pattern对象获取Matcher对象，Matcher具备获取的功能
		Matcher matcher  = pattern.matcher(str);
		//4.用matcher对象获取
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}

		test2();
	}
	
	public static void test()
	{
		String str = "我我..我我..我.我要...要要...要要...要学学....学学学...编编...编编..编程...程程...程程..程.程";
		String str1 =str.replaceAll ("\\.","");
		String str2= str1.replaceAll("(.)\\1+","$1");
		System.out.println(str2);

	}
	//对ip地址按照数值顺序排序。
	 //     192.168.1.200  10.10.10.10  4.4.4.4 127.0.0.1
	public static void test2()
	{
		String str = "192.168.1.200  10.10.10.10  4.4.4.4 127.0.0.1";
		str = str.replaceAll("(\\d{1,3})","00$1");
		str = str.replaceAll("0*(\\d{3})","$1");

		String[] arr = str.split(" +");
		Arrays.sort(arr);
		for (String ss:arr)
		{
			System.out.println(ss.replaceAll("0*(\\d{1,3})","$1"));
		}
		
	}

}
