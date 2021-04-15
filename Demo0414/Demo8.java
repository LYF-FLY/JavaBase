import java.io.*;
class  Demo8
{
	public static void main(String[] args) throws IOException
	{
		//创建文件输入流对象和文件相关联
		FileReader fr = new FileReader("bf.txt");
		//为提高效率，使用字符输入缓冲流
		BufferedReader br = new BufferedReader(fr);


		String line = br.readLine();
		System.out.println(line);//因为返回的时候不包括换行符所以自己加换行符
		line = br.readLine();
		System.out.println(line);//因为返回的时候不包括换行符
		line = br.readLine();
		System.out.println(line);//因为返回的时候不包括换行符
		line = br.readLine();
		System.out.println(line);//null 

		br.close();
	}
}
