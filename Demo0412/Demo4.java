/*
TreeSet：底层是二叉树数据存储，Set结尾所以无序
			具备排序功能:加入到里面的对象是能比较大小的
			1、添加到集合的对象所属的类要实现Comeparable接口中的comepareTo方法
			集合是依据该方法的返回值来确定谁大谁小返回值为零证明二者相同
			2、添加到集合中的对象本身具备的比较大小的方式不满足需求
			可以定义比较大小的方式，这种自定义的比价方式必须实现Comparator接口的compare方法

*/
import java.util.*;

class ComByLength implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		if(!(obj1 instanceof String))
			throw new ClassCastException("类型不对");
		if(!(obj2 instanceof String))
			throw new ClassCastException("类型不对");

		String str1 = (String)obj1;
		String str2 = (String)obj2;

		return str1.length() - str2.length();

	}
}
class  Demo4
{
	public static void main(String[] args) 
	{
		//根据字符串长度比较长度
		ComByLength comByLength = new ComByLength();
		TreeSet ts = new TreeSet(comByLength);//当存在自定义的，先用自定义的

		ts.add("sdfasdfdf");
		ts.add("dfsd");
		ts.add("sfasfasdadfa");

		System.out.println(ts);
	}
}
