import java.io.*;
class  Demo8
{
	public static void main(String[] args) throws IOException
	{
		//�����ļ�������������ļ������
		FileReader fr = new FileReader("bf.txt");
		//Ϊ���Ч�ʣ�ʹ���ַ����뻺����
		BufferedReader br = new BufferedReader(fr);


		String line = br.readLine();
		System.out.println(line);//��Ϊ���ص�ʱ�򲻰������з������Լ��ӻ��з�
		line = br.readLine();
		System.out.println(line);//��Ϊ���ص�ʱ�򲻰������з�
		line = br.readLine();
		System.out.println(line);//��Ϊ���ص�ʱ�򲻰������з�
		line = br.readLine();
		System.out.println(line);//null 

		br.close();
	}
}
