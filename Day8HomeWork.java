class Home1 
{
	public static void main(String[] args) 
	{
		Poker pai1=new Poker("����","K");

		Poker pai2=new Poker("����","Q");

		Hand leftHand=new Hand(pai1);
		Hand rightHand=new Hand(pai2);

		Person xiaoming=new Person(leftHand,rightHand);

		xiaoming.swap();

        xiaoming.showInfo();
		
	}
}
//С�������ƣ�С�����ֺ����ֱַ�����һ���˿��ƣ���Ҫ������ֻ���е��˿��ơ����С��չʾ��������˿��ơ��˿����л�ɫ�͵������ԡ����ѣ�
class Person
{
	Hand leftHand;
	Hand rightHand;

	Person()
	{}
	Person(Hand leftHand,Hand rightHand)
	{
		this.leftHand=leftHand;
		this.rightHand=rightHand;
	}
	//������ֻ���е��˿���
    public void swap()
	{
		leftHand.swap(rightHand);
	}

   //չʾ�����Ƶ���Ϣ
   public void showInfo()
	{
		System.out.println("����:"+leftHand.getInfos());
		System.out.println("����:"+rightHand.getInfos());
	}
}
class Hand  //����
{
	Poker poker;//��������

	Hand()
	{}

	Hand(Poker poker)
	{
		this.poker=poker;
	}
	//����һֻ���е��ƽ���
	public void swap(Hand hand)
	{
		Poker temp=this.poker;
		this.poker=hand.poker;
		hand.poker=temp;
	}
	//���������Ƶ���Ϣ
    public String getInfos()
	{
		return poker.getInfo();
	}


}
class Poker//����
{
	String color;
	String points;

	Poker()
	{}

	Poker(String color,String points)
	{
		this.color=color;
		this.points=points;
	}

	public String getInfo()
	{
		return "��ɫ��"+color+",����:"+points;
	}
}

