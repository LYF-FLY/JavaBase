import java.util.*;
class Queue
{
	private LinkedList list;

	Queue()
	{
		list = new LinkedList();
	}
	//Èë¶Ó
	public void inQueue(Object obj)
	{
		list.addLast(obj);
	}
	//³ö¶Ò
	public Object deQueue()
	{
		return list.removeFirst();
	}

	public boolean isNull()
	{
		return list.isEmpty();
	}
}
class Demo8
{
	public static void main(String[] args) 
	{
		Queue que = new Queue();
		que.inQueue("a");
		que.inQueue("b");
		que.inQueue("c");
		while(!que.isNull())
		{
			System.out.println(que.deQueue());
		}
	}
}
