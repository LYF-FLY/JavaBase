//用链表实现队列
import java.util.*;
class Queue
{
	private LinkedList list;

	Queue()
	{
		list = new LinkedList();
	}
	//入队
	public void inQueue(Object obj)
	{
		list.addLast(obj);
	}
	//出兑
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
