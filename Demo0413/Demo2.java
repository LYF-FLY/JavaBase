import java.io.*; 
class  Demo2
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr  = new FileReader("bf.txt");

		int num;
		//一次读一个字符，读到最后返回-1；
		while (fr.read() != -1)
		{
			System.out.print((char)num);
		}
	}
}
