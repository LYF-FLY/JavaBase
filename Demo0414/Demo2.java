import java.io.*; 
class  Demo2
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr  = new FileReader("bf.txt");

		int num;
		//һ�ζ�һ���ַ���������󷵻�-1��
		while (fr.read() != -1)
		{
			System.out.print((char)num);
		}
	}
}
