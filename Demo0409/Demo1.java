/*
Collection
		List: 存储的对象是有序的（集合中对象的存放顺序和向集合中添加对象的顺序一致），可以重复的，类似链表
		特有的方法，都是操作下标的方法
*/
import java.util.*;
class  Demo1
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add("java1sdfs");
		list.add("java2sdfas");
		list.add("java3asdfsadf");

		//在指定下标添加
		list.add(1,"hello");
		sop(list);

		List list2 = new ArrayList();
		list2.add("html");
		list2.add("java3");
		list2.add("java4");

		//在下标1后面添加集合，即插入2的位置
		list.addAll(2,list2);
		sop(list);

		//删除指定索引元素
		list.remove(1);
		sop(list);

		//修改
		list.set(1,"bigdata");
		sop(list);

		//获取指定位置元素
		Object obj = list.get(1);
		sop(obj);

		//获取元素第一次和最后一次出现的索引
		int index = list.indexOf("java3");
		sop(index);
		index = list.lastIndexOf("jav2");
		sop(index);

		//截取一部分元素存到新集合,不包含结尾
		List lists = list.subList(1,3);
		sop(lists);

		//排序
		list.sort((o1,o2)->((String)o1).length()-((String)o2).length());
		sop(list);

		//  R apply（T t）  参数依次接受集合中每个元素，返回值替换原来的元素
		list.replaceAll(t->((String)t).concat("ok"));
		sop(list);



	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}
