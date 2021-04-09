/*
LinkList  �ײ������� �����޸ģ������ڲ���

�Զ���˫������
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

	//�������
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

	//ɾ���ڵ�
	private void removeNode(Node node)
	{
		if(size == 1)//����ֻ��һ���ڵ�
		{
			this.first = null;
			this.last = null;

		}else if(this.first == node)//ɾ���Ľڵ���ͷ���
		{
			this.first = this.first.next;
			this.first.previous = null;
		}
		else if(this.last == node) //���һ���ڵ�
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
//��������ɾ���ڵ�
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
