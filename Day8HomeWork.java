class Home1 
{
	public static void main(String[] args) 
	{
		Poker pai1=new Poker("红桃","K");

		Poker pai2=new Poker("黑桃","Q");

		Hand leftHand=new Hand(pai1);
		Hand rightHand=new Hand(pai2);

		Person xiaoming=new Person(leftHand,rightHand);

		xiaoming.swap();

        xiaoming.showInfo();
		
	}
}
//小明交换牌：小明左手和右手分别拿了一张扑克牌，需要交换两只手中的扑克牌。最后小明展示交换后的扑克牌。扑克牌有花色和点数属性。（难）
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
	//交换两只手中的扑克牌
    public void swap()
	{
		leftHand.swap(rightHand);
	}

   //展示手中牌的信息
   public void showInfo()
	{
		System.out.println("左手:"+leftHand.getInfos());
		System.out.println("右手:"+rightHand.getInfos());
	}
}
class Hand  //手类
{
	Poker poker;//牌在手中

	Hand()
	{}

	Hand(Poker poker)
	{
		this.poker=poker;
	}
	//和另一只手中的牌交换
	public void swap(Hand hand)
	{
		Poker temp=this.poker;
		this.poker=hand.poker;
		hand.poker=temp;
	}
	//反回手中牌的信息
    public String getInfos()
	{
		return poker.getInfo();
	}


}
class Poker//牌类
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
		return "花色："+color+",点数:"+points;
	}
}

