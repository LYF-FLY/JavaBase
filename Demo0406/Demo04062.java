/*
��װ��
�Ի������ݰ�װ���ܽ��в���

װ�����

������ ��Data

���ڸ�ʽ��
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

		Byte b = new Byte((byte)6);//װ��
		b.byteValue();//����

		//jdk1.5�Ժ��Զ�װ��
		Byte num = 6;

		num = (byte)(num+5);//��NUM.bytValue()+5 �Զ�����  �������͵ĺͻ������͵Ľ�������


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
		//n1 == n2 true ��ֵ��һ���ֽڷ�Χ�ڵģ�����Ѿ�������ڴ��ַһ��
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
		//�����ڸ�ʽ��
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd E HH:MM:SS");
		String riqi = sim.format(date);
		sop(riqi);
		// ���ַ���תΪDate
		SimpleDateFormat sim2 = new SimpleDateFormat("yyyy-MM-dd E HH:MM:SS");
		Date d2 = sim2.parse("2021-04-06 ���ڶ� 11:04:325");
		sop(d2);


	long time = System.currentTimeMillis();
	Date d = new Date(time); //��lang���͵�תΪdate���͵�
	sop(d);

	long d3 = new Date().getTime();//��date��תΪlong��
	sop(d3);

	}
	public static void sop(Object obj) 
	{
		System.out.println(obj);
	}
}
