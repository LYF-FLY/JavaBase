/*
ArrayList ��List�����࣬˵���ü��������ҵײ�������
�������ݲ��ң����������ݵ����ɾ��
�̲߳���ȫ��

Vector���̰߳�ȫ��
*/
import java.util.*;
class  Demo4
{
	public static void main(String[] args) 
	{
		Vector vector = new Vector();
		vector.add("java1sdfs");
		vector.add("java2sdfas");
		vector.add("java3asdfsadf");
		vector.add("java3asdfsadf");
		Enumeration enu = vector.elements();
		while(enu.hasMoreElements())
		{
			Object obj = enu.nextElement();
			sop(obj);
		}
		sop("===================================");
		ArrayList list = new ArrayList();
		list.add("java1sdfs");
		list.add("java2sdfas");
		list.add("java3asdfsadf");
		list.add("java3asdfsadf");
		sop(list);

		sop("===================================");

		//ȥ����������ͬ�Ķ���
		ArrayList list1 = quChong(list);
		sop(list1);
		

		sop("===================================");
	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static ArrayList quChong(ArrayList list)
	{
		ArrayList list1 = new ArrayList(); //�¼��ϲ��ظ�
		for (int i=0; i<list.size(); i++)
		{
			Object obj = list.get(i);
			if(!list1.contains(obj)) //�ײ����equalsʵ�֣��Աȵ����ڴ��ַ
			{
				list1.add(obj);
			}
		}
		return list1;
	}
	

}