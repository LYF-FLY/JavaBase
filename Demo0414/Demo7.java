import java.io.*;
/*
��������Ϊ����߶���д��Ч��
		�����������߱�������д��Ч��
		���������ܵ���ʹ��
		�������Ŷ�������д��

�ַ�������������BufferedReader ���ⲿ�������ڴ�
�ַ������������BufferedWriter ���ڴ����д���ļ�
*/
class  Demo7
{
	public static void main(String[] args) throws IOException
	{
		//ʹ���ַ�������ʵ���ı�д������
		FileWriter fw = new FileWriter("bf.txt");
		//Ϊ���Ч�ʣ�ʹ���ַ����������
		//����Ҫ���Ч�ʵ���������󴫸�����������Ĺ��췽��
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i =0; i<3; i++)
		{
			bw.write("abc");
			bw.newLine();
		}

		bw.close();//˳��ˢ��������������ڵ�����д���ļ�
		

		System.out.println("Hello World!");
	}
}
