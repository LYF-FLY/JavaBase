/*
װ�����ģʽ�������Ѿ����ڵĹ����ṩ��ǿ�Ĺ���

����Ϊ�����Ч�ʣ��Ϳ��Ե�������һ���������Ч�ʵ��࣬˭��Ҫ�����Ч�ʾͰ�˭��Ϊʵ�δ��ݸ������Ĺ��췽��


*/
import java.io.*;
class  Demo10
{
	//ʹ�û����������ļ�
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
