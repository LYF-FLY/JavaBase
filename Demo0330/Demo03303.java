/*
如何确定使用抽象类还是接口

全科动物：警犬，导盲犬，搜爆犬
提取共性的属性和方法的时候，出现了抽象方法
不同类有同样的行为用借口

class 犬科动物 
{
	public abstract void 训练（）
}
class 警犬 extends 犬科动物
{
	public void 训练（）
	{
	}
	public  void 破案（）
	{
	}
}
class 导盲犬 extends 犬科动物
{
	public void 训练（）
	{
	}
}
class 搜爆犬 extends 犬科动物
{
	public void 训练（）
	{
	}
	public void 搜爆（）
	{
	}

}
interface 搜爆
{
	public abstract void 搜爆（）；
}
class 搜爆猪
{

}
class 搜爆猫
{

}
*/

/*
多态：前提是存在继承
class 动物
{}
class 猫extends动物
{}
把猫看成动物：动物 mao = new m猫（）
多态：把子类类型的对象看成父类类型
弊端：父类中没有的方法不能实现
好处：在函数的参数上使用父类类型，就不需要定义多个函数了


*/
abstract class Animal
{
	public abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("猫吃鱼");
	}
	public void catchM()
	{
		System.out.println("猫抓老鼠");
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{
		//Animal cat = new Cat();
		Animal cat = new Cat();//向上转型
		eat(cat);
		Cat mao = (Cat)cat;//强制转换以后就能实现子类的方法了
		//mao.catchM();
	}
	public static void eat(Animal animal)
	{
		animal.eat();
		if(animal instanceof Cat)//判断一下是否是子类
		{
			Cat cat2 = (Cat)animal;
		}
	}
}
/*
对于多态中的成员变量来说，编译时期看父类，运行结果看父类，只有继承的时候才看子类
对于多态中的非静态成员函数来说，编译时期看父类，运行结果看子类，即重写的方法看子类
静态成员方法：运行结果看父类

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
		Fu zi = new Zi();//多态
		//zi.num;看父类所以不能用子类的num
		System.out.println(zi.age);//19
		zi.show();
		zi.ff();
	}
}
 //================
 //把子类对象看成父接口类型
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
 