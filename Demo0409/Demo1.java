/*
Collection
		List: �洢�Ķ���������ģ������ж���Ĵ��˳����򼯺�����Ӷ����˳��һ�£��������ظ��ģ���������
		���еķ��������ǲ����±�ķ���
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

		//��ָ���±����
		list.add(1,"hello");
		sop(list);

		List list2 = new ArrayList();
		list2.add("html");
		list2.add("java3");
		list2.add("java4");

		//���±�1������Ӽ��ϣ�������2��λ��
		list.addAll(2,list2);
		sop(list);

		//ɾ��ָ������Ԫ��
		list.remove(1);
		sop(list);

		//�޸�
		list.set(1,"bigdata");
		sop(list);

		//��ȡָ��λ��Ԫ��
		Object obj = list.get(1);
		sop(obj);

		//��ȡԪ�ص�һ�κ����һ�γ��ֵ�����
		int index = list.indexOf("java3");
		sop(index);
		index = list.lastIndexOf("jav2");
		sop(index);

		//��ȡһ����Ԫ�ش浽�¼���,��������β
		List lists = list.subList(1,3);
		sop(lists);

		//����
		list.sort((o1,o2)->((String)o1).length()-((String)o2).length());
		sop(list);

		//  R apply��T t��  �������ν��ܼ�����ÿ��Ԫ�أ�����ֵ�滻ԭ����Ԫ��
		list.replaceAll(t->((String)t).concat("ok"));
		sop(list);



	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}
