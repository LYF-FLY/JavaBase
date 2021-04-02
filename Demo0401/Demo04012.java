/*
可变参数:必须位于参数列表的最后一个
*/
class  Demo1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		add(1,1,1,1,1,1,1,1);

		"hello".concat("world");//Liangjie 

		String str = "ww,rr,ee,ff";//切割
		String[] arr = str.split(",");

		String s2 = String.join(",","呵呵呵","haha");//用逗号拼接

		String s3 = String.format("%10s%2d%.2f%6c","hello",55,12.12345,'c');//格式化，这些东西叫占位符
		sop(s3);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void add(int ... a)//任意个数都行
	{
		int sum = 0;
		for (int num:a )
		{
			sum += num;
		}
	}
}
