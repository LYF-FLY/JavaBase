import java.io.*;
class  Demo1
{
	public static void main(String[] args) throws IOException
	{
		//���ı��ļ���д���ı�
		//��Ϊ�ı����ַ����������ַ������
		//����Ϊ���ļ�����ʹ��writer�Ŀ��Բ����ļ������࣬FileWriter
		
		//1.�����ļ����������ͱ��������ļ������
		//�ļ��������Զ�����
		FileWriter fw = new FileWriter("tmp.txt");

		//2.ʹ���ļ�������������ļ���д�����ݣ�д�뵽�������ڲ���������
		fw.write("abc");
		fw.flush();//ˢ����

		//3.�ر��� ��Ϊ������ϵͳ����
		fw.close();

		//���ı��ļ��ж�ȡ���ݣ���Ϊ���ı��ļ�������ʹ���ַ���
		//�ַ�������ĸ�����Reader����Ϊi���������ļ�
		//�����ļ�����������ͱ���ȡ���ļ������
		//����ȡ���ļ���Ҫʵ�ִ���
		FileReader fr = new FileReader("tmp.txt");
		//2.��ȡ int read���� һ�ζ�һ���ַ�
		int num;


		System.out.println("Hello World!");
	}
}
