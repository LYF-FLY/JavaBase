class Demo6 
{
	public static void main(String[] args) 
	{
		Properties pro = System.getProperties();
		String line = pro.getProperty("line.separator");//得到系统的换行符

		FileWriter fw = new FileWriter("tem.txt",true);
		fw.write("\r\n");
		fw.write("hello"); //每次运行都从文件开头写入
		System.out.println("Hello World!");
	}
}
