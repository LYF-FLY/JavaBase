/*
集合：存储不同类型的多个对象
随着添加对象的个数的增加，自动扩容
集合提供丰富的操作集合中数据的方法
只能存储引用类型的对象
每个集合就是容器

Collection最共性的方法
*/
import java.util.*;
import java.util.function.*;
class  Demo4
{
	public static void main(String[] args) 
	{
		//添加
		Collection coll = new ArrayList(); //容器
		coll.add("java1");
		coll.add("java2");
		coll.add("java3");
		coll.add("java4");
		coll.add(666);  //因为集合只能放引用类型的数据 所以装箱了 不是基本数据类型了  成为整型对象了
		System.out.println(coll);
		Collection coll2 = new ArrayList();
		coll2.add("html");
		coll2.add("hahah");
		coll2.add("spring");
		coll.addAll(coll2);
		System.out.println(coll);

		//删除
		coll.remove("java1");
		System.out.println(coll);

		//coll.removeAll(coll2);//删除和另一个集合中相同的元素
		//coll.retainAll(coll2);//保留相同的，即删除不同的
		//coll.clear();//清空所有

		//匿名内部类删除java开头的元素
		coll.removeIf(new Predicate(){
			public boolean test(Object t)
			{
				if(t instanceof String)
				{
					String ss = (String)t;
					if(ss.startsWith("java"))
						return true;
				}
				
					return false;
			}
		});
		//lambda表达式实现
		coll.removeIf(t->{
			if(t instanceof String)
			{
				String ss = (String)t;
					if(ss.startsWith("java"))
						return true;
			}
			return false;
		});
		
		

		//coll.removeIf(t->(String t).startWith("java"));
		System.out.println(coll);


		//判断
		boolean boo = coll2.contains("html");//baohan
		System.out.println(boo);
		boo = coll2.containsAll(coll);//包含
		System.out.println(boo);
		boo = coll.isEmpty();//空
		System.out.println(boo);
		int num = coll.size();//个数
		System.out.println(num);
		
		//集合转数组,因为数组不能随意添加删除，为了数据安全
		Object[] array = coll.toArray();
		System.out.println(array.length);

		//遍历 Iterator iterator() 迭代器 调用的内部类 自己去看原码

		Iterator ite =coll.iterator(); //迭代器
		while(ite.hasNext())
		{
			Object obj = ite.next();
			System.out.println(obj);
		}

		coll.forEach(t->System.out.println(t));//lambda表达式
		coll.forEach(System.out::println);//静态方法引用

		for(Object obj:coll)//增强for循环
		{
			System.out.println(obj);
		}




	}
}
