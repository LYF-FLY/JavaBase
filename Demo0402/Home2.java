import java.util.*;
class Home2 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int pay = random.nextInt(16)+15;

		Person person =new Person("С��",25);
		person.pay(pay);
	}
}
class Person
{
	private int money;//���ϵ�Ǯ
	private String name;

	Person()
	{}

	Person(String name,int money)
	{
		this.name=name;
		this.money=money;
	}

	public void pay(int money)//��Ҫ֧����Ǯ��
	{
		if(this.money>=money)
            System.out.println("Ǯ��֧��");
		else
			throw new NotEnoughMoneyException("�Բ�����");
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
С��ȥ����Է������ϴ���22��Ǯ���������[15, 30]��Χ�ķ�Ǯ�����С����Ǯ����֧����Ǯ��
�׳�һ�� NotEnoughMoneyException������ʱ�쳣��ʹ��Random���������,  import  java.util.Random;

������ɷ�Ǯ
Random random = new Random();
int cost = random.nextInt(16) + 15;
*/
