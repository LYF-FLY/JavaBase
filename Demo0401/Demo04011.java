/*
字符串：字符串不变; 它们的值在创建后不能被更改。
*/
class Demo1 
{
	public static void main(String[] args) 
	{
		//先去堆中的常量池找有没有这个字符串，没找到就去堆中的字符串常量池创建字符串
		String str1 = "hello";
		//先去堆中的常量池中找有没有这个字符串，找到了，会使用已经有的字符串
		String str2 = "hello";
		sop(str1==str2);//true

		//上面那个是创建的一个对象 这个创建了两个对象，一个是使用new创建的对象，一个是字符串对象
		String str3 = new String("hello");
		sop(str3);
		sop(str1==str3);//false 比较的是地址而不是内容

		boolean boo = str1.equals(str3);//true 说明字符串把Object的方法重写了，比较的不是地址而是内容，不然两个不同的对象肯定是false
		sop(boo);//true
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}


//字符串方法
class Demo2 
{
	//验证登录用户和密码
	public static boolean checkLogin(String username, String password)
	{
		if(username != null && username !="" && password != null && password !="")
		{
			if("admin".equals(username)&&"admin".equals(password))
				return true;
		}
			return false;
	}
	//判断邮箱的格式对不对
	public static boolean checkEmail(String email)
	{
		if(email != null && email !="")
		{
			if(email.indexOf('.')==-1)
				return false;
			else if(email.indexOf('@')==-1)
				return false;
			else if(email.indexOf('@')<email.indexOf('.'))
				return false;
			else 
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception
	{
		boolean boo = "hello ".contains("llo");
		sop(boo);//true

		boolean boo2 = "hello".equalsIgnoreCase("HELLO");
		sop(boo2);//true 验证码

		"hello.txt".startsWith("hello");
		"hello.txt".endsWith("txt");

		"".isEmpty();//true

		sop("hello".length());//5
		sop("hello".charAt(4));//o
		sop("hello".indexOf('l'));//2
		sop("hello".indexOf('l',3));//3
		sop("hello".indexOf("he"));//0
		sop("hello".lastIndexOf('l'));//3
		sop("hello".indexOf('a'));//2

		//字符数组转字符串
		char[] arr = {'a','s','d','f'};
		String str1 = new String(arr);
		sop(str1);

		String str2 = new String(arr,1,3);
		sop(str2);

		//字符串转字符数组
		char[] arr2 = "hhhhh".toCharArray();
		for(char ch:arr2)
		{
			sop(ch);
		}

		//字节数组转成字符串
		byte[] arr3 = {65, 66, 67, 68};
		String str4 = new String(arr3);//解码
		sop(str4);

		//字符串转成字节数组
		byte[] arr4 = str4.getBytes();//编码 GBK
		for (byte num:arr4 )
		{
			sop(num);
		}

		byte[] arr5 = "你好".getBytes("UTF-8");//编码 
		for (byte num:arr5 )
		{
			sop(num);
		}

		String str5 = new String(arr5, "UTF-8");
		sop(str5);

		String s3 = "adfasfs".substring(3);//默认截取到最后一个
		String s4 = "adfasfs".substring(3,5);//包括起始，不包括结束的
		sop(s3);
		sop(s4);

		String s5 = "aaaa".toUpperCase();
		sop(s5);
		String s6 = "AAAA".toLowerCase();
		sop(s6);

		String s7 = "    aaa   aaaa   ".trim();//去空格
		sop(s7);

		int i = "abc".compareTo("abd");
		sop(i);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}