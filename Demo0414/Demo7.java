import java.io.*;
/*
缓冲流：为了提高读或写的效率
		缓冲流本身不具备读或者写的效率
		缓冲流不能单独使用
		必须结合着读流或者写流

字符缓冲输入流：BufferedReader 从外部读输入内存
字符缓冲输出流：BufferedWriter 从内存输出写入文件
*/
class  Demo7
{
	public static void main(String[] args) throws IOException
	{
		//使用字符缓冲流实现文本写入数据
		FileWriter fw = new FileWriter("bf.txt");
		//为提高效率，使用字符缓冲输出流
		//把需要提高效率的输出流对象传给缓冲流对象的构造方法
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i =0; i<3; i++)
		{
			bw.write("abc");
			bw.newLine();
		}

		bw.close();//顺便刷新输出流，将流内的内容写入文件
		

		System.out.println("Hello World!");
	}
}
