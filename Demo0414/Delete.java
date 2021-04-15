import java.io.*;
class delete
{
	public static void main(String[] args) 
	{
		File path = new File("D:\\daima\\Demo0415");//指定路径
		String exegc = "^.+" + "java.bak" + "$";//正则表达式
		File[] files = path.listFiles();//列出该路径下所有文件

		String npath;
		String name;

		//FileOutputStream fos = new FileOutputStream("file1.txt");//建立一个字符输出流
		for (File file:files)//遍历文件
		{
			//if((name=file.getName()).endsWith(".java")) //以.java结尾
			if((name=file.getName()).matches(exegc))//	符合正则表达式
			{
				npath = path + "\\" + name;
				File dfile = new File(npath);
				dfile.delete();
			}
		}
		//fos.close();
	}
}
