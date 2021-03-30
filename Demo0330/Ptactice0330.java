/*

根据以下这段话的描述，用面向对象的思想实现

狗生活在陆地上（是一种陆生动物），既是哺乳类的也是肉食性的。
狗通常的时候和人打招呼会通过“摇摇尾巴”，在被抚摸情绪很好的时候，
会“旺旺叫”，而在受到惊吓情绪烦躁时，会发出“呜呜”声；

猫也生活在陆地上（是一种陆生动物），既是哺乳类的也是肉食性的。
猫通常的时候和人打招呼会发出“喵～”的声音，在被抚摸情绪很好时，
会发出“咕噜咕噜”声，而在受到惊吓时，会发出“嘶嘶”声；

青蛙是一种两栖动物（既是水生动物也是陆生动物），既不是哺乳类的也不是肉食性的，
属于卵生。青蛙通常的时候和人打招呼会通过“呱呱叫”，当青蛙情绪好的时候，
会在岸边“呱呱呱”的唱歌，而在受到惊吓时，会“扑通一声跳入水中”
*/
abstract class Animals 
{
	public static final int HAPPY = 1;//用符号常量让别人知道什么意思
	public static final int UNHAPPY = 2;
	boolean mammal;
	boolean carnibornous;//食肉
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
	String imm = "哺乳动物";
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
		System.out.println("摇摇尾巴");
	}
	public  void godMind()
	{
			System.out.println("旺旺旺");
	}
	public  void badMind()
	{
			System.out.println("呜呜呜");
	}
	public void immal()
	{
		System.out.println("哺乳");
	}
	public void meat()
	{
		System.out.println("吃肉");
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
		return "摇摇尾巴";
	}
	public String sayHello(int mood)
	{
		setMood(mood);
		switch(getMood())
		{
			case HAPPY: return"汪汪叫";
			case UNHAPPY:return"wuwu";
			default:
				return"摇摇尾巴";
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

		if(dog.isMammal())  //逻辑在main方法写
			System.out.println("狗是哺乳动物");
		else
			System.out.println("狗不是哺乳动物");

		System.out.println(dog.HAPPY);//HAPPY是静态成员变量，只能通过对象或者类来访问

		System.out.println("狗情绪好的时候的回应"+dog.sayHello(dog.HAPPY));

		if(dog.haveLegs())
			System.out.println("狗是陆生的");
		else
			System.out.println("狗不是陆生的");

		


		//dog.greet();
	}
}
