import java.util.*;
class  Demo2
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add("java1sdfs");
		list.add("java2sdfas");
		list.add("java3asdfsadf");

		//������
		Iterator ite = list.iterator();
		while(ite.hasNext())
		//	Exception in thread "main" java.util.ConcurrentModificationException
       // at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:911)
       // at java.util.ArrayList$Itr.next(ArrayList.java:861)
       // at Demo1.main(Demo1.java:62)

		{
			String str = (String)ite.next();
			if("java3ok".equals(str))
		//		list.remove("java3ok"); //��ʹ�õ������Լ��ϵ���ʱ����������м��ϵ�����޸�ɾ��
			ite.remove();//�õ�����ɾ��
		}
		sop(list);

		//listר�õ�����
		ListIterator ite2 = list.listIterator();
		while(ite2.hasNext())//����α�ָ�����Ԫ�ص���һ��

		{
			String str = (String)ite2.next();
			if("java3".equals(str))
			ite2.remove();//�õ�����ɾ��
			ite2.set("hhe");
			ite2.add("ah");
		}
		sop(list);

		while(ite2.hasPrevious())
		{
			Object obj = ite2.previous();
			sop(obj);
		}





	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}