import java.io.*;
/*
�Լ�ʵ��BufferedReader,MyBufferedReader

1����Ҫһ��������
2����¼�����±�ı���
3/��¼�ַ�����
*/
class MyBufferedReader
{
	 
	 private char[] arr = new char[1024];
	 private int index;
	 private int count;

	 private Reader r;
	 MyBufferedReader(Reader r) //װ�����ģʽ��˭��Ҫ���Ч�ʣ��Ͱ�˭��Ϊ���췽���Ĳ���
	{
		this.r = r;
	}
	//һ�ζ�һ���ַ��Ĺ���,�ӻ�������ȡ�ַ�
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
	//һ�ζ�һ��
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