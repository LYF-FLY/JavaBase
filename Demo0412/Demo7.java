//在方法上定义泛型
//泛型限定 <? extends Person> 限定上限，他的子类类型
//<? super E> 限定E或者他的父类类型
class Test<E>
{
	public void show(E e)//类创建对象的泛型确定了类型，该方法的类型才确定
	{
		System.out.println(e);
	}
	public <E> void fun(E ee)//方法自己使用泛型,相当于Object
	{
		System.out.println(ee);
	}
	public static <E> void funn(E eee)//静态方法只能自己使用泛型
	{
		
	}
}
class Demo7 
{
	public static void main(String[] args) 
	{
		Test<String> test = new Test<>();
		test.show("hahah");
		test.fun("hahah");
		test.fun(99);
	}
}
