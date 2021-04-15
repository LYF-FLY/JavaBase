import java.io.*;
class  Demo1
{
	public static void main(String[] args) throws IOException
	{
		//向文本文件中写入文本
		//因为文本是字符，所以用字符输出流
		//又因为是文件所以使用writer的可以操作文件的子类，FileWriter
		
		//1.创建文件输出流对象和被操作的文件相关联
		//文件不存在自动创建
		FileWriter fw = new FileWriter("tmp.txt");

		//2.使用文件输出流对象向文件中写入数据，写入到流对象内部的数组了
		fw.write("abc");
		fw.flush();//刷新流

		//3.关闭流 因为调用了系统功能
		fw.close();

		//从文本文件中读取数据：因为是文本文件，所以使用字符流
		//字符输出流的父类是Reader，因为i操作的是文件
		//创建文件输入流对象和被读取的文件相关联
		//被读取的文件需要实现存在
		FileReader fr = new FileReader("tmp.txt");
		//2.读取 int read（） 一次读一个字符
		int num;


		System.out.println("Hello World!");
	}
}
