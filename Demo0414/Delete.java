import java.io.*;
class delete
{
	public static void main(String[] args) 
	{
		File path = new File("D:\\daima\\Demo0415");//ָ��·��
		String exegc = "^.+" + "java.bak" + "$";//������ʽ
		File[] files = path.listFiles();//�г���·���������ļ�

		String npath;
		String name;

		//FileOutputStream fos = new FileOutputStream("file1.txt");//����һ���ַ������
		for (File file:files)//�����ļ�
		{
			//if((name=file.getName()).endsWith(".java")) //��.java��β
			if((name=file.getName()).matches(exegc))//	����������ʽ
			{
				npath = path + "\\" + name;
				File dfile = new File(npath);
				dfile.delete();
			}
		}
		//fos.close();
	}
}
