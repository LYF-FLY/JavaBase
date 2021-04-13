/*
jdk1.5才有的，让程序更安全
泛型:通过<>指定一种引用数据类型，作用是在编译时期就检查集合元素是不是指定数据类型
		从而把运行时期的问题转移到编译时期，提高安全性
		导致集合只能添加字符串类型
		创建对象的时候用

*/
import java.util.*;
class Demo6 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();//泛型不一定用，用了更安全

		list.add("java");
		list.add("java");
		//list.add(66);

		Iterator ite = list.iterator();
		while (ite.hasNext())
		{

			//Object obj = ite.next(); 因为泛型限制了输入数据只能是字符串
			
			String str = te.next();
		}
	}
}
