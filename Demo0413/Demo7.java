//Collections方法
//Prorerties还Map集合类，每个键对应一个字符串
class  Demo7
{
	public static void main(String[] args) 
	{
		Properties pro = System.getProperties();
		Set<String> keys = pro.stringProper();
		System.out.println("Hello World!");
	}
}
