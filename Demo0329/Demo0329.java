/*
���ģʽ�����ĳһ����������Ч�ķ���
		23�����ģʽ
		�������ģʽ���������һ����ֻ��һ�����������
		1��Ĭ��һ������Դ��������󣬹��췽��˽���ˡ��Ͳ��ܴ����������
		2�����췽��˽���ˣ�һ�������û�ˣ�˽�еĹ��췽���ڱ������ǿ����õ�
		3���ڱ����д����Ķ�����Ҫ�����õ����ṩpublic�ķ���
		4����Ϊ��粻�ܴ����������public�������뾲̬
		5����Ϊ��̬��ֻ��ʹ�þ�̬�ĳ�Ա�����Գ�Ա����Ҳ��Ҫ�Ǿ�̬de

�����ഴ������ʱ����ִ�и���Ĺ��췽������ִ������Ĺ��췽��
��Ϊϵͳ�Զ�������Ĺ��췽���ĵ�һ�м���super����
����̳и��࣬��Ȼ�̳и�������ԣ��������ø���ĸ������Ը�ֵ�����


*/

class SuperMan//����ʽ
{
	private static SuperMan man = new SuperMan();//һ����Ա����ͬʱ��ʼ������ֹ���ͨ������ֱ�Ӷ����޸����԰����޸�Ϊprivate

	private SuperMan(){}

	public static SuperMan getSuperMan()//����޷�ͨ��ʵ������ȡ��ֻ�ܾ�̬�������У���������ĳ�Ա����Ҳ�Ǿ�̬��
	{
		return man;
	}
}
class Single//����ʽ�����̴߳������ݲ�������
{
	private static Single single;//û����ʵ��

	private Single(){}//�޷�ʵ����

	public static Single getInstance()
	{
		if(single == null)
			single = new Single();
		return single;
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		SuperMan sm = SuperMan.getSuperMan();
		Single.getInstance();
	}
}
/*
�����ӹ����
*/

class Factory
{
	private static Factory factory = new Factory();

	private Factory(){}

	private int num;

	public static Factory getInstance()
	{
		return factory;
	}

	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return this.num;
	}

	public void process()
	{
		num++;
		System.out.println("���ǵ�"+num+"�����");
	}

}
class Demo2
{
	public static void main(String[] args) 
	{
		Factory fc = Factory.getInstance();
		fc.process();

	}
}

//���췽���ļ̳�
class Fu
{
	private int age;
	Fu(int age)
	{
		this.age = age;
	}
	Fu()
	{
		System.out.println("fu");
	}
}
class Zi extends Fu
{
	Zi()
	{
		//super();����д�ϣ���ֹ���������
		System.out.println("zi");
	}
	Zi(int age)
	{
		super(age);
	}
}

class Demo3
{
	public static void main(String[] args) 
	{
		Zi zi = new Zi();

	}
}
//�̳��еĳ�Ա����,super�������ã�ֻ�е��������������ͬ����ͻʱ���������֣�����ĳ�Ա��������Ѹ���ĸ���
class Fa
{
	private int num = 5;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
}
class Son extends Fa
{
	int num = 6;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	public void show()
	{
		System.out.println(super.getNum());
	}
}
class Demo4
{
	public static void main(String[] args) 
	{
		Son son = new Son();
		son.show();

	}
}