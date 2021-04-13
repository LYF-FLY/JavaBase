import java.util.*;
class Home2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	//2.设计一个方法，删除一个集合中，所有的指定的元素。例如，将集合中所有的3都删除。
    public static void del(List list,Object obj)
	{
		list.removeIf(e->e.equals(obj));
	}

   //3.设计一个方法，将一个存储有体重信息的集合，所有的数据乘2
   public static void update(List list)
	{
		list.replaceAll(e->(((Double)e)*2);
	}


   //4.设计一个方法，在一个存储了若干个视频的集合中，删除所有的以 .mp4 结尾的元素。
   public static void dels(List list)
	{
		list.removeIf(e->((String)e).endsWith(".mp4"));
	}
}
