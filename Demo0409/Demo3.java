import java.util.*;
class  Demo3
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add("java1sdfs");
		list.add("java2sdfas");
		list.add("java3asdfsadf");

		//
		for (int i=0; i<list.size(); i++)
		{
			sop(list.get(i));
		}

		while (!list.isEmpty())
		{
			sop(list.remove(0));//ɾ��������ɾ��Ԫ�أ�ɾ��һ�������ͱ�0
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}