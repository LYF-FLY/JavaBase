/*
���ȷ��ʹ�ó����໹�ǽӿ�

ȫ�ƶ����Ȯ����äȮ���ѱ�Ȯ
��ȡ���Ե����Ժͷ�����ʱ�򣬳����˳��󷽷�
��ͬ����ͬ������Ϊ�ý��

class Ȯ�ƶ��� 
{
	public abstract void ѵ������
}
class ��Ȯ extends Ȯ�ƶ���
{
	public void ѵ������
	{
	}
	public  void �ư�����
	{
	}
}
class ��äȮ extends Ȯ�ƶ���
{
	public void ѵ������
	{
	}
}
class �ѱ�Ȯ extends Ȯ�ƶ���
{
	public void ѵ������
	{
	}
	public void �ѱ�����
	{
	}

}
interface �ѱ�
{
	public abstract void �ѱ�������
}
class �ѱ���
{

}
class �ѱ�è
{

}
*/

/*
��̬��ǰ���Ǵ��ڼ̳�
class ����
{}
class èextends����
{}
��è���ɶ������ mao = new mè����
��̬�����������͵Ķ��󿴳ɸ�������
�׶ˣ�������û�еķ�������ʵ��
�ô����ں����Ĳ�����ʹ�ø������ͣ��Ͳ���Ҫ������������


*/
abstract class Animal
{
	public abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("è����");
	}
	public void catchM()
	{
		System.out.println("èץ����");
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{
		//Animal cat = new Cat();
		Animal cat = new Cat();//����ת��
		eat(cat);
		Cat mao = (Cat)cat;//ǿ��ת���Ժ����ʵ������ķ�����
		//mao.catchM();
	}
	public static void eat(Animal animal)
	{
		animal.eat();
		if(animal instanceof Cat)//�ж�һ���Ƿ�������
		{
			Cat cat2 = (Cat)animal;
		}
	}
}
/*
���ڶ�̬�еĳ�Ա������˵������ʱ�ڿ����࣬���н�������ֻ࣬�м̳е�ʱ��ſ�����
���ڶ�̬�еķǾ�̬��Ա������˵������ʱ�ڿ����࣬���н�������࣬����д�ķ���������
��̬��Ա���������н��������

*/
class Fu
{
	int age = 19;
	public void show()
	{
		System.out.println("fu");
	}
	public static void ff()
	{
		System.out.println("fffu");
	}
}
class Zi extends Fu
{
	int num = 6;
	int age = 99;
	public void show()
	{
		System.out.println("zi");
	}
	public void fun()
	{
		System.out.println("fun");
	}
	public static void ff()
	{
		System.out.println("ffzi");
	}
}
class Test
{

	public static void main(String[] args)
	{
		Fu zi = new Zi();//��̬
		//zi.num;���������Բ����������num
		System.out.println(zi.age);//19
		zi.show();
		zi.ff();
	}
}
 //================
 //��������󿴳ɸ��ӿ�����
 interface inter
 {
	 void fun();
 }
 class Test1 implements inter
 {
	 public void fun()
	 {
		System.out.println("test1");
	 }
 }
class Demo2
{

	public static void main(String[] args)
	{
		inter tt = new Test1();
		Test1 t1 = new Test1();
		show(t1);
	}
	public static void show(inter tt)
	{
		tt.fun();
	}

}
 