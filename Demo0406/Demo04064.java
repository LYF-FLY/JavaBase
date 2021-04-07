//��������������������
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
		System.out.println("��"+cal.get(Calendar.YEAR));
		System.out.println("��"+cal.get(Calendar.MONTH)); //��0�¿�ʼ
		System.out.println("��"+cal.get(Calendar.DAY_OF_MONTH));//�������ǹ���ĵ�һ�� ���·ݴ�o��ʼ
	}
}

class Demo3
{
	public static void main(String[] args)
	{
		System.out.println(Math.ceil(9.2));
		System.out.println(Math.floor(9.2));
		System.out.println(Math.sqrt(36));
		System.out.println(Math.random());//dayu0.0 С��1.0
		System.out.println(Math.pow(2,3));
	}
}
