/*
��װ��ֻ������ṩ���õ����Ժ���Ϊ������ò�����private
this�����ã���java�ڲ������
���캯����ֻ��������������ģ�ϵͳ�������Զ�����һ�����캯��
�ص㣺1������ͬ��2.�޷���ֵ3������Լ�д�˹��캯������ôϵͳ�Ͳ����Զ�����ղεĹ��캯���ˣ����Ի�Ҫ�Լ�дһ���յ�
static:���γ�Ա����Ա��������Ա����


*/
class GirlFriend
{
	static String contry="CN";//���е�GirlFriend������һ��country�ڴ棬������ʵ����������ǰ�Ϳ����ڴ���
	private String temper;
	private String name;
	private int age;
	private int weight;
	private int height;
		
	GirlFriend()//���캯��֮����ñ���д�ڵ�һ��
	{
			this(20);
		
	}
	GirlFriend(int age)
	{
		//this(); ���ܻ������
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;//name = str; //��name = name �ֲ������ͳ�Ա����ͬ��������ʹ�þֲ���������ʹ���Լ��ı���
	}
	public String getName()
	{
		return name;
	}

	public void setAge(int age)
	{
		this.age = age;//this�൱�ڶ��󣬶���ֻ�ܷ������Լ��ĳ�Ա��������age�Ǿֲ�����������this.age�ͺ�age���ֿ���
		
	}
	public int getAge()
	{
		return age;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public int getHeight()
	{
		return height;
	}
	public void setTemper(String temper)
	{
		this.temper = temper;
	}
	public String getTemper()
	{
		return temper;
	}

	public boolean compareAge(GirlFriend other)
	{
		return this.age == other.age;
			
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		GirlFriend liupei = new GirlFriend(); //��JVMִ�����д���ʱ��this��ָ��ǰʹ�õĶ���
		liupei.setAge(22);//��JVMִ�����д���ʱ����ǰʹ�õĶ�����liupei��ָ��Ķ�������this��ָ��liupei��ָ��Ķ����൱�ڰ�liupei�д洢�ĵ�ַ����this
		
		liupei.contry="usa";//���еĶ��󶼻���usa
		System.out.println(GirlFriend.contry);//��Ϊδʵ������ǰ�Ϳ����ڴ���

		GirlFriend lv = new GirlFriend();
		lv.setAge(22);
		System.out.println(lv.getAge());
		System.out.println();


		boolean boo = liupei.compareAge(lv);
		System.out.println(boo);

	}
}

class Demo2
{
	GirlFriend gir = new GirlFriend();//���캯�����������������
}