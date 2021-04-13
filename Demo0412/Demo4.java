/*
TreeSet���ײ��Ƕ��������ݴ洢��Set��β��������
			�߱�������:���뵽����Ķ������ܱȽϴ�С��
			1����ӵ����ϵĶ�����������Ҫʵ��Comeparable�ӿ��е�comepareTo����
			���������ݸ÷����ķ���ֵ��ȷ��˭��˭С����ֵΪ��֤��������ͬ
			2����ӵ������еĶ�����߱��ıȽϴ�С�ķ�ʽ����������
			���Զ���Ƚϴ�С�ķ�ʽ�������Զ���ıȼ۷�ʽ����ʵ��Comparator�ӿڵ�compare����

*/
import java.util.*;

class ComByLength implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		if(!(obj1 instanceof String))
			throw new ClassCastException("���Ͳ���");
		if(!(obj2 instanceof String))
			throw new ClassCastException("���Ͳ���");

		String str1 = (String)obj1;
		String str2 = (String)obj2;

		return str1.length() - str2.length();

	}
}
class  Demo4
{
	public static void main(String[] args) 
	{
		//�����ַ������ȱȽϳ���
		ComByLength comByLength = new ComByLength();
		TreeSet ts = new TreeSet(comByLength);//�������Զ���ģ������Զ����

		ts.add("sdfasdfdf");
		ts.add("dfsd");
		ts.add("sfasfasdadfa");

		System.out.println(ts);
	}
}
