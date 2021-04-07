/*
包装类
对基本数据包装就能进行操作

装箱拆箱

常用类 ：Data

日期格式化
*/
import java.util.*;
import java.text.*;
class  Demo2
{
	public static void main(String[] args) 
	{
		int a = Integer.MAX_VALUE+1;
		String str = Integer.toString(a);
		System.out.println(str);

		sop(Integer.toBinaryString(a));

		Byte b = new Byte((byte)6);//装箱
		b.byteValue();//拆箱

		//jdk1.5以后自动装箱
		Byte num = 6;

		num = (byte)(num+5);//先NUM.bytValue()+5 自动拆箱  引用类型的和基本类型的进行运算


	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

class Demo3
{
	public static void main(String[] args)
	{
		Integer n1 = 66;
		Integer n2 = 66;
		//n1 == n2 true 数值在一个字节范围内的，如果已经定义过内存地址一样
		Integer n3 = 129;
		Integer n4 = 129;
		//n3==n4 false
	}
}

class  Demo4
{
	
	public static void main(String[] args) throws ParseException
	{
		Date date =  new Date();
		sop(date);
		//对日期格式化
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd E HH:MM:SS");
		String riqi = sim.format(date);
		sop(riqi);
		// 把字符串转为Date
		SimpleDateFormat sim2 = new SimpleDateFormat("yyyy-MM-dd E HH:MM:SS");
		Date d2 = sim2.parse("2021-04-06 星期二 11:04:325");
		sop(d2);


	long time = System.currentTimeMillis();
	Date d = new Date(time); //把lang类型的转为date类型的
	sop(d);

	long d3 = new Date().getTime();//把date的转为long的
	sop(d3);

	}
	public static void sop(Object obj) 
	{
		System.out.println(obj);
	}
}
