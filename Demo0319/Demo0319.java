class Demo1 
{
	public static void main(String[] args) 
	{
		long num1 = 11l;
		float num2 = 1.1f;
		System.out.println(num1 + num2);
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
	int num1 = 11;
	float num2 = 1.1f;
	double num3 = 1.3;
	
	//数据类型转换 低精度向高精度自动转换
	double sum = num1+num2+num3;

	/*
	自动数据类型转换从高精度转为低精度
	99的二进制：00000000 00000000 00000000 01100011
	==>砍掉高位三个字节变为01100011
	==》99
	*/
	
	byte num5=99;
			  
	byte num6=127;
	//num6=num6+10;//低级别会自动向高级别类型转 但是高精度不一定会自动转低精度，所以要强制类型转换	
	/*
	127+10是int类型的，在内存中以补码形式存在是00000000 00000000  00000000  10001001
	强制转换为byte类型 砍掉三个字节变为10001001，这个也是补码，那么它代表一个负数，对他取反加1，成为其正数原码，表示数字119
	所以该补码代表的负数就是-119
	*/
	num6 = (byte)(num6+10);//高精度强制转换为低精度 -119

	char ch = 97; //从高精度int自动转换为低精度char类型00000000 00000000 00000000 01100001砍两个字节变00000000 01100001

	System.out.println(num5);
	}
}

class Demo3
{

	public static void main(String[] args)
	{
		
		System.out.println(-5%-2);//-1结果的正负由被除决定
		
		int m=5, n;
		//相当于m+1 n=m n+=m m+1 m-1 n+=m
		n = ++m + m++ + --m; //6 + 6 +6
		System.out.println(n);
					
	}

}

class Demo4
{

	public static void main(String[] args)
	{

			byte sum =0;
			//sum = sum+6;不兼容
			sum+=6;//可行，因为会内部强制类型转换
			System.out.println(sum);
int a=0,b=0;
			//int a = false;java里没法转换
			//表达式：由运算符和变量或数值组合在一起的式子，叫表达式，是有值的
			System.out.println(a==b);//false
			System.out.println(a=99);//99

	}
}
class Demo5
{

	public static void main(String[] args)
	{
		//位运算符：// &与
		// |或
       // ^异或对应位不同结果是1，相同为0 
		//~按位取反
		//<< >> >>>Integer.toBinaryString()
		System.out.println(Integer.toBinaryString(~(0b111)));
		System.out.println(7^3^3);//7异或同一个数两次则数字不变
		System.out.println(~8);//按位取反加1是-8，不加1是-9

		int num1=1, num2=2, num3=3;
		
		System.out.println((num1>num2 && num1>num3) ? num1:(num2>num3  ? num2:num3));
		
	}
}
 