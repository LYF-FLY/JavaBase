import java.util.*;
class Home2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	//2.���һ��������ɾ��һ�������У����е�ָ����Ԫ�ء����磬�����������е�3��ɾ����
    public static void del(List list,Object obj)
	{
		list.removeIf(e->e.equals(obj));
	}

   //3.���һ����������һ���洢��������Ϣ�ļ��ϣ����е����ݳ�2
   public static void update(List list)
	{
		list.replaceAll(e->(((Double)e)*2);
	}


   //4.���һ����������һ���洢�����ɸ���Ƶ�ļ����У�ɾ�����е��� .mp4 ��β��Ԫ�ء�
   public static void dels(List list)
	{
		list.removeIf(e->((String)e).endsWith(".mp4"));
	}
}
