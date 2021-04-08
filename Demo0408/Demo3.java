import java.util.regex.*;
import java.util.Arrays;
class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String str = "qwewer   qwer  ddfgd  sdfg";
		//��ȡ���ĸ��ַ����ɵĵ���
		//1����ȡ�����ݹ�ͬ���ϵ�������ʽ
		String regex = "[a-z]{4}";
		//2����������ʽ����ΪPattern���͵Ķ���
		Pattern pattern =Pattern.compile(regex);
		//3.ʹ��Pattern�����ȡMatcher����Matcher�߱���ȡ�Ĺ���
		Matcher matcher  = pattern.matcher(str);
		//4.��matcher�����ȡ
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}

		test2();
	}
	
	public static void test()
	{
		String str = "����..����..��.��Ҫ...ҪҪ...ҪҪ...Ҫѧѧ....ѧѧѧ...���...���..���...�̳�...�̳�..��.��";
		String str1 =str.replaceAll ("\\.","");
		String str2= str1.replaceAll("(.)\\1+","$1");
		System.out.println(str2);

	}
	//��ip��ַ������ֵ˳������
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
