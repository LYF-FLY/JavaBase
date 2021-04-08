/*
���ϣ��洢��ͬ���͵Ķ������
������Ӷ���ĸ��������ӣ��Զ�����
�����ṩ�ḻ�Ĳ������������ݵķ���
ֻ�ܴ洢�������͵Ķ���
ÿ�����Ͼ�������

Collection��Եķ���
*/
import java.util.*;
import java.util.function.*;
class  Demo4
{
	public static void main(String[] args) 
	{
		//���
		Collection coll = new ArrayList(); //����
		coll.add("java1");
		coll.add("java2");
		coll.add("java3");
		coll.add("java4");
		coll.add(666);  //��Ϊ����ֻ�ܷ��������͵����� ����װ���� ���ǻ�������������  ��Ϊ���Ͷ�����
		System.out.println(coll);
		Collection coll2 = new ArrayList();
		coll2.add("html");
		coll2.add("hahah");
		coll2.add("spring");
		coll.addAll(coll2);
		System.out.println(coll);

		//ɾ��
		coll.remove("java1");
		System.out.println(coll);

		//coll.removeAll(coll2);//ɾ������һ����������ͬ��Ԫ��
		//coll.retainAll(coll2);//������ͬ�ģ���ɾ����ͬ��
		//coll.clear();//�������

		//�����ڲ���ɾ��java��ͷ��Ԫ��
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
		//lambda���ʽʵ��
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


		//�ж�
		boolean boo = coll2.contains("html");//baohan
		System.out.println(boo);
		boo = coll2.containsAll(coll);//����
		System.out.println(boo);
		boo = coll.isEmpty();//��
		System.out.println(boo);
		int num = coll.size();//����
		System.out.println(num);
		
		//����ת����,��Ϊ���鲻���������ɾ����Ϊ�����ݰ�ȫ
		Object[] array = coll.toArray();
		System.out.println(array.length);

		//���� Iterator iterator() ������ ���õ��ڲ��� �Լ�ȥ��ԭ��

		Iterator ite =coll.iterator(); //������
		while(ite.hasNext())
		{
			Object obj = ite.next();
			System.out.println(obj);
		}

		coll.forEach(t->System.out.println(t));//lambda���ʽ
		coll.forEach(System.out::println);//��̬��������

		for(Object obj:coll)//��ǿforѭ��
		{
			System.out.println(obj);
		}




	}
}
