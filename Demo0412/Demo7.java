//�ڷ����϶��巺��
//�����޶� <? extends Person> �޶����ޣ�������������
//<? super E> �޶�E�������ĸ�������
class Test<E>
{
	public void show(E e)//�ഴ������ķ���ȷ�������ͣ��÷��������Ͳ�ȷ��
	{
		System.out.println(e);
	}
	public <E> void fun(E ee)//�����Լ�ʹ�÷���,�൱��Object
	{
		System.out.println(ee);
	}
	public static <E> void funn(E eee)//��̬����ֻ���Լ�ʹ�÷���
	{
		
	}
}
class Demo7 
{
	public static void main(String[] args) 
	{
		Test<String> test = new Test<>();
		test.show("hahah");
		test.fun("hahah");
		test.fun(99);
	}
}
