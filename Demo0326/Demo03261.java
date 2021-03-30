/*
当成员变量被所在类所用的对象所共享时修饰为static
当该方法没有用到所在类的非静态成员时修饰为static
因为静态的在非静态以前开辟内存,所以静态方法无法调用非静态成员变量


*/
class  Demo1
{
	public static void main(String[] args) //相当于一个静态方法
	{
		System.out.println(args[0]);
	}

	public static void main(int a) //相当于一个静态方法
	{
		System.out.println(a);
	}
}

class Demo2
{
	public static void main(String[] args)
	{
		String[] str ={"hahahha"};
		int a = 99;
		Demo1.main(str);
		Demo1.main(a);	
	}	
}
class Demo3
{
		public static void main(String[] args)
	{
		int[] arr= {1,2,4,5,21};
		int index = ArrayTool.halfFind(arr, 21);
		System.out.println(index);
	}	

}