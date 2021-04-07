//让一个类有固定个数对象，定义枚举类
enum Season //继承了Enum 不能再继承了
{
	SPRING{
		public void show(){}
	},SUMMER{
		public void show(){}
	},AUTUMN{
		public void show(){}
	},WINTER{
		public void show(){}
	} ;       //在底层这就是四个私有静态对象 public static final
	Season(){}//构造方法默认就是private的
	public void setDesc(){}
	public static void fun(){}
	public abstract void show();//有抽象方法必须对对象进行重写
}

/*
class Season
{
	public static final Season SPRING = new Season();
	private Season(){}
}
*/

class  Demo
{
	public static void main(String[] args) 
	{
		Season sea = Season.SPRING;

		Season[] weeks = {Season.SPRING,Season.SUMMER,Season.AUTUMN,Season.WINTER};

		System.out.println(weeks[1].ordinal());//返回枚举项的编号

		System.out.println(weeks[1].compareTo(weeks[3]));//比较枚举项的大小

		Season season = Enum.valueOf(Season.class,"SPRING");

		System.out.println(season);

		Season[] sea1 = Season.values(); //得到所有枚举项

	}
}

/*
*/
