/*
LinkList  底层是链表 便于修改，不便于查找

自定义双向链表
*/
class Node
{
	Object date;
	Node previous;
	Node next;
}
class MyLinkList
{
	Node first;
	Node last;
	int size;

	MyLinkList(){}

	//添加数据
	public void add(Object obj)
	{
		Node node = new Node();
		if(this.first == null)
		{
			node.date = obj;
			node.previous = null;
			node.next = null;


			this.first = node;
			this.last = this.first;
		}else{
			node.date = obj;
			this.last.next = node;
			node.previous = this.last;
			node.next = null;
			this.last = node;
		}
		size ++;
	}

	public Object get(int index)
	{
		Node tmp = null;
		if(this.first != null)
		{
			tmp = this.first;

			for(int i =0; i<index; i++)
				tmp = tmp.next;

			return tmp.date;
		}
		return null;
	}
	public Node getNode(int index)
	{
		Node tmp = null;
		if(this.first !=null)
		{
			tmp = this.first;

			for(int i =0; i<index; i++)
				tmp = tmp.next;

			return tmp;
		}
		return null;
	}

	//删除节点
	private void removeNode(Node node)
	{
		if(size == 1)//链表只有一个节点
		{
			this.first = null;
			this.last = null;

		}else if(this.first == node)//删除的节点是头结点
		{
			this.first = this.first.next;
			this.first.previous = null;
		}
		else if(this.last == node) //最后一个节点
		{
			this.last = this.last.previous;

			node.previous = null;
			this.last.next = null;
		}
		else
		{
			node.previous.next = node.next;
			node.next.previous = node.previous;

			node.previous = null;
			node.next = null;
		}

		size --;
	}
//根据索引删除节点
	public Object remove(int index)
	{
		Node node = getNode(index);
		removeNode(node);

		return node.date;
	}
}

class  Demo6
{
	public static void main(String[] args) 
	{
		MyLinkList link = new MyLinkList();
		link.add("hahah");
		System.out.println(link.size);
		link.remove(0);
		System.out.println(link.size);
		
	}
}
