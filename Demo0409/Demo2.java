import java.util.*;
class  Demo2
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add("java1sdfs");
		list.add("java2sdfas");
		list.add("java3asdfsadf");

		//迭代器
		Iterator ite = list.iterator();
		while(ite.hasNext())
		//	Exception in thread "main" java.util.ConcurrentModificationException
       // at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:911)
       // at java.util.ArrayList$Itr.next(ArrayList.java:861)
       // at Demo1.main(Demo1.java:62)

		{
			String str = (String)ite.next();
			if("java3ok".equals(str))
		//		list.remove("java3ok"); //在使用迭代器对集合迭代时，不允许进行集合的添加修改删除
			ite.remove();//用迭代器删除
		}
		sop(list);

		//list专用迭代器
		ListIterator ite2 = list.listIterator();
		while(ite2.hasNext())//最后游标指向最后元素的下一个

		{
			String str = (String)ite2.next();
			if("java3".equals(str))
			ite2.remove();//用迭代器删除
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