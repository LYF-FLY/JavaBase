/*
局部变量没有默认值
成员变量有默认值

局部变量的作用域是从其定义的位置开始到其所在的大括号
成员变量的左右域是其所在的整个类

局部变量在栈中开辟内存
成员变量在堆中开辟内存

局部变量在当其所在的函数被调用时开辟内存
成员变量当其创建对象时开辟内存

局部变量是在当其作用域结束了释放内存
成员变量当其所属对象被辣鸡回收时释放内存

*/
class Car
{
	String color;//描述对象的属性
	int num;

	public void run()//描述对象的行为
	{
		System.out.println("跑");
	}
}
//在类中定义的变量是成员变量
//在类中定义的方法是成员方法
class  Demo1
{
	public static void main(String[] args) 
	{
		Car benchi = new Car();//奔驰存储了new Car（）在堆中开辟内存的地址

		benchi.color = "white";
		benchi.num = 4;
		benchi.run();
		System.out.println("奔驰的颜色" + benchi.color + "奔驰的轮子" + benchi.num);
	}
}

class  Demo2
{
	public static void main(String[] args) 
	{
		Car benchi = new Car();//奔驰存储了new Car（）在堆中开辟内存的地址

		benchi.color = "white";
		benchi.num = 4;
		benchi.run();
		System.out.println("奔驰的颜色" + benchi.color + "奔驰的轮子" + benchi.num);
	}
}