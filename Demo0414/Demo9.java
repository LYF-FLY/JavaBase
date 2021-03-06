import java.io.*;
/*
自己实现BufferedReader,MyBufferedReader

1、需要一个缓冲区
2、记录数组下标的变量
3/记录字符个数
*/
class MyBufferedReader
{
	 
	 private char[] arr = new char[1024];
	 private int index;
	 private int count;

	 private Reader r;
	 MyBufferedReader(Reader r) //装饰设计模式，谁需要提高效率，就把谁作为构造方法的参数
	{
		this.r = r;
	}
	//一次读一个字符的功能,从缓冲区中取字符
	public int myRead() throws IOException
	{
		if(count == 0)
		{
			count = r.read(arr);
			index = 0;
		}
		if(count < 0)
			returm -1;
		int num = arr[index];
		index++;
		count--;
		return num;		
	}
	//一次读一行
	public String myReadLine() throws IOException
	{
	StringBuilder sb = new StringBuilder();
	int num;
	while((num = myRead())!=-1)
	{
		if(num == '\r')
		{
			continue;
		}
		else if(num == '\n')
		{
			return sb.toString();
		}
		else
		{
			sb.append((char)num);
		}
	}
	}


}
class Demo9 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
