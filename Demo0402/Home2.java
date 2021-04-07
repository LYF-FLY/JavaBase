import java.util.*;
class Home2 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int pay = random.nextInt(16)+15;

		Person person =new Person("小明",25);
		person.pay(pay);
	}
}
class Person
{
	private int money;//身上的钱
	private String name;

	Person()
	{}

	Person(String name,int money)
	{
		this.name=name;
		this.money=money;
	}

	public void pay(int money)//需要支付的钱数
	{
		if(this.money>=money)
            System.out.println("钱够支付");
		else
			throw new NotEnoughMoneyException("吃不起饭了");
	}

}
class NotEnoughMoneyException extends RuntimeException
{
	NotEnoughMoneyException()
	{}

	NotEnoughMoneyException(String message)
	{
		super(message);
	}
}
/*
小明去饭店吃饭，身上带了22块钱，随机产生[15, 30]范围的饭钱，如果小明的钱不够支付饭钱，
抛出一个 NotEnoughMoneyException的运行时异常。使用Random产生随机数,  import  java.util.Random;

随机生成饭钱
Random random = new Random();
int cost = random.nextInt(16) + 15;
*/
