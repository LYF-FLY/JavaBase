/*
��̬����飬������ļ��ض�ִ�У���ִֻ��һ�Σ�������main��ִ��
�������ݿ�ʱʹ�ã���֤��ִ����ִֻ��һ��

�������飺�����Ѵ�����ִ�У������ڹ��췽����ִ��

��������ʹ�õ���������Ժ���ֽ��룬�����ȼ����ֽ��뵽������
����о�̬������ִ�о�̬�����
�ڶ��п����ڴ�
�����Ը�Ĭ��ֵ
�����Ը���ʼֵ������������еĻ���
ִ�й�������
ִ�й��췽��
�Ѷ����ڶ��еĵ�ַ������ջ�еı���
*/
class Test
{
	static int num = 5;

	static
		{
			System.out.println("c");
		}

	public static void show()
	{
		System.out.println(num);
	}
}
class  Demo1
{
	static
	{
		System.out.println("a");
	}

	public static void main(String[] args) 
	{
		//Test test = new Test();
		//Test.show();
		//Test test = null; û�м���Test���Բ�ִ�о�̬�����
	}

	static
	{
		System.out.println("b");
	}
}

class Person
{
	private int age = 44;

	{
		System.out.println(age;//�ڹ��췽����ǰʵ��

	}

	public Person(int age)
	{
		this.age =age;
	}





}

class Demo2
{
	public static void main(String[] args)
	{
		Person per = new Person(18);
	}
}