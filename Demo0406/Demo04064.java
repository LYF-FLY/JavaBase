//计算两个日期相差多少天
import java.util.*;
import java.text.*;

class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public static int getDays(String date1, String date2) throws ParseException
	{
		SimpleDateFormat sim2 = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sim2.parse(date1);
		Date d2 = sim2.parse(date1);

		long time = d2.getTime() - d1.getTime();

		return (int)(time/1000/60/60/24);
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("年"+cal.get(Calendar.YEAR));
		System.out.println("月"+cal.get(Calendar.MONTH)); //从0月开始
		System.out.println("日"+cal.get(Calendar.DAY_OF_MONTH));//星期天是国外的第一天 且月份从o开始
	}
}

class Demo3
{
	public static void main(String[] args)
	{
		System.out.println(Math.ceil(9.2));
		System.out.println(Math.floor(9.2));
		System.out.println(Math.sqrt(36));
		System.out.println(Math.random());//dayu0.0 小于1.0
		System.out.println(Math.pow(2,3));
	}
}
