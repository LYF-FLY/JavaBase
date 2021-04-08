//正则表达式 专门针对字符串
//判断qq号是否合法
class Demo1 
{
	public static void main(String[] args) 
	{
		String qq = "123456";
		boolean boo = checkQQ(qq);
		System.out.println(boo);

		String regex = "[1-9][0-9]{4,14}";//正则表达式 [0-9] == \\d {4,}至少出现四次，多的不限
		String regex2 = "b？o+k*"; //表示中间o出现一次或多次， b出现0或1次 k出现多次

		boo = qq.matches(regex);
		System.out.println(boo);
	}

	public static boolean checkQQ(String qq)
	{
		int len = qq.length();

		if(len >= 5 && len<=15)
		{
			if(!qq.startsWith("0"))
			{
				try{
					long hao = Long.parseLong(qq);
					return true;
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else
			System.out.println("0开头了");
		}
		else
			System.out.println("长度不合法");

		return false;
	}
}
