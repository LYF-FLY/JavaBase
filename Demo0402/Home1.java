import java.util.*;
class Home1 
{
	public static void main(String[] args) 
	{
		//System.out.println(sum());

		//getChar(null,'d')

		String ss = generate(7);
		System.out.println(ss);
	}

	//1.���һ������������ӿ���̨������������ֵĺͣ������������ʱ����쳣
	public static int sum()
	{
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("�������һ����");
			int num1=sc.nextInt();

			System.out.println("������ڶ�����");
			int num2=sc.nextInt();

			return num1+num2;

		}catch(InputMismatchException e)
		{
			e.printStackTrace();
			return -1;
		}

	}

	/*
     ��һ�����б�дһ�������������������һ���ַ��������Ƿ����ĳ���ַ���
	 ������ڣ��򷵻�����ַ����ַ������е�һ�γ��ֵ�λ�ã���Ŵ�0��ʼ���㣩��
	 ���򣬷���-1��Ҫ�������ַ�������ַ����Բ�����ʽ���ݴ��ݸ��÷�����
	 ������������Ϊnull��Ӧ�׳�IllegalArgumentException�쳣��
	 �����main�������Ը��ֿ��ܳ��ֵ����������֤�÷�����д���Ƿ���ȷ��
	 ���磬�ַ������ڣ��ַ����ڣ����������Ϊnull�ȡ�
     getIndex(null,'a');

	*/

	public static int getChar(char[] arr,char ch)
	{
		if(arr==null)
			throw new IllegalArgumentException();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
				return i;
		}
		return -1;
	}

	//����һ�����ȣ�����һ��ָ�����ȵ��ַ�����
	//����ַ������������ĸ�����ֻ��»�����ɡ�(���ñ���ͬʱ������ĸ�����֡��»���)  ʹ��Random���������
	public static String generate(int length)
	{
		String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

        Random  random = new Random();

        String str="";
		for(int i=1;i<=length;i++)
		{
		    str=str.concat(String.valueOf(data.charAt(random.nextInt(data.length()))));
		}
		return str;      

	}

}
