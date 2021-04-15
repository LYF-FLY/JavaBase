/*
装饰设计模式：基于已经存在的功能提供增强的功能

都是为了提高效率，就可以单独定义一个用于提高效率的类，谁需要被提高效率就把谁作为实参传递给这个类的构造方法


*/
import java.io.*;
class  Demo10
{
	//使用缓冲流复制文件
	public static void main(String[] args) 
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		try
		{
			br = new BufferedReader(new FileReader("Demo1.java"));
		bw = new BufferedWriter(new FileWriter("Demo1_copy.java"));

		String line = null;
		while ((line = br.readLine())!=null)
		{
			bw.write(line);
			bw.newLine();
		}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}finally
		{
			if(br != null)
			try{
				br.close();
				}catch(IOException e)
		{
			e.printStackTrace();
		}
			if(bw != null)
			try{
					bw.close();
				}catch(IOException e)
			{
				e.printStackTrace();
			}
				
		}

		
		System.out.println("Hello World!");
	}
}
