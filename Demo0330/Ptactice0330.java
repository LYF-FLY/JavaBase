/*

����������λ�������������������˼��ʵ��

��������½���ϣ���һ��½����������ǲ������Ҳ����ʳ�Եġ�
��ͨ����ʱ����˴��к���ͨ����ҡҡβ�͡����ڱ����������ܺõ�ʱ��
�ᡰ�����С��������ܵ�������������ʱ���ᷢ�������ء�����

èҲ������½���ϣ���һ��½����������ǲ������Ҳ����ʳ�Եġ�
èͨ����ʱ����˴��к��ᷢ�������������������ڱ����������ܺ�ʱ��
�ᷢ�������๾�ࡱ���������ܵ�����ʱ���ᷢ����˻˻������

������һ�����ܶ������ˮ������Ҳ��½��������Ȳ��ǲ������Ҳ������ʳ�Եģ�
��������������ͨ����ʱ����˴��к���ͨ�������ɽС��������������õ�ʱ��
���ڰ��ߡ������ɡ��ĳ��裬�����ܵ�����ʱ���ᡰ��ͨһ������ˮ�С�
*/
abstract class Animals 
{
	public static final int HAPPY = 1;//�÷��ų����ñ���֪��ʲô��˼
	public static final int UNHAPPY = 2;
	boolean mammal;
	boolean carnibornous;//ʳ��
	private int mood; // 1godd 2bad
 
	public void setMood(int mood)
	{
		this.mood = mood;
	}
	public int getMood()
	{
		return this.mood;
	}
		
	public boolean isMammal()
	{
		return this.mammal;
	}
	public boolean isCarnibornous()
	{
		return this.carnibornous;
	}

	public abstract String sayHello();
	public abstract String sayHello(int mood);

	//public abstract void greet(); 
	//public abstract void godMind();
	//public abstract void badMind();

}
interface water
{
	void water();
}
interface filed
{
	boolean haveLegs();
}
interface luansheng
{
	void luansheng();
}
interface immal
{
	String imm = "���鶯��";
}
interface meat
{
	void meat();
}
/*
class Dog extends  Animals implements immal, meat
{

	public  void greet()
	{
		System.out.println("ҡҡβ��");
	}
	public  void godMind()
	{
			System.out.println("������");
	}
	public  void badMind()
	{
			System.out.println("������");
	}
	public void immal()
	{
		System.out.println("����");
	}
	public void meat()
	{
		System.out.println("����");
	}

}
*/
class Dog extends Animals implements filed
{
	Dog()
	{
		this.mammal = true;
		this.carnibornous = true;
	}
	public String sayHello()
	{
		return "ҡҡβ��";
	}
	public String sayHello(int mood)
	{
		setMood(mood);
		switch(getMood())
		{
			case HAPPY: return"������";
			case UNHAPPY:return"wuwu";
			default:
				return"ҡҡβ��";
		}		
	}
	public boolean haveLegs()
		{
			return true;
		}
}

class Demo1 
{
	public static void main(String[] args) 
	{
		Dog dog = new Dog();

		if(dog.isMammal())  //�߼���main����д
			System.out.println("���ǲ��鶯��");
		else
			System.out.println("�����ǲ��鶯��");

		System.out.println(dog.HAPPY);//HAPPY�Ǿ�̬��Ա������ֻ��ͨ�����������������

		System.out.println("�������õ�ʱ��Ļ�Ӧ"+dog.sayHello(dog.HAPPY));

		if(dog.haveLegs())
			System.out.println("����½����");
		else
			System.out.println("������½����");

		


		//dog.greet();
	}
}
