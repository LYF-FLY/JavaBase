class Demo6 
{
	public static void main(String[] args) 
	{
		Properties pro = System.getProperties();
		String line = pro.getProperty("line.separator");//�õ�ϵͳ�Ļ��з�

		FileWriter fw = new FileWriter("tem.txt",true);
		fw.write("\r\n");
		fw.write("hello"); //ÿ�����ж����ļ���ͷд��
		System.out.println("Hello World!");
	}
}
