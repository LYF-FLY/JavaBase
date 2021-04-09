/*
ArrayList 是List的子类，说明该集合有序，且底层是数组
便于数据查找，不便于数据的添加删除
线程不安全的

Vector是线程安全的
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

		//去除集合中相同的对象，
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
		ArrayList list1 = new ArrayList(); //新集合不重复
		for (int i=0; i<list.size(); i++)
		{
			Object obj = list.get(i);
			if(!list1.contains(obj)) //底层就是equals实现，对比的是内存地址
			{
				list1.add(obj);
			}
		}
		return list1;
	}
	

}