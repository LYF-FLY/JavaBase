/*
�ַ������ַ�������; ���ǵ�ֵ�ڴ������ܱ����ġ�
*/
class Demo1 
{
	public static void main(String[] args) 
	{
		//��ȥ���еĳ���������û������ַ�����û�ҵ���ȥ���е��ַ��������ش����ַ���
		String str1 = "hello";
		//��ȥ���еĳ�����������û������ַ������ҵ��ˣ���ʹ���Ѿ��е��ַ���
		String str2 = "hello";
		sop(str1==str2);//true

		//�����Ǹ��Ǵ�����һ������ �����������������һ����ʹ��new�����Ķ���һ�����ַ�������
		String str3 = new String("hello");
		sop(str3);
		sop(str1==str3);//false �Ƚϵ��ǵ�ַ����������

		boolean boo = str1.equals(str3);//true ˵���ַ�����Object�ķ�����д�ˣ��ȽϵĲ��ǵ�ַ�������ݣ���Ȼ������ͬ�Ķ���϶���false
		sop(boo);//true
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}


//�ַ�������
class Demo2 
{
	//��֤��¼�û�������
	public static boolean checkLogin(String username, String password)
	{
		if(username != null && username !="" && password != null && password !="")
		{
			if("admin".equals(username)&&"admin".equals(password))
				return true;
		}
			return false;
	}
	//�ж�����ĸ�ʽ�Բ���
	public static boolean checkEmail(String email)
	{
		if(email != null && email !="")
		{
			if(email.indexOf('.')==-1)
				return false;
			else if(email.indexOf('@')==-1)
				return false;
			else if(email.indexOf('@')<email.indexOf('.'))
				return false;
			else 
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception
	{
		boolean boo = "hello ".contains("llo");
		sop(boo);//true

		boolean boo2 = "hello".equalsIgnoreCase("HELLO");
		sop(boo2);//true ��֤��

		"hello.txt".startsWith("hello");
		"hello.txt".endsWith("txt");

		"".isEmpty();//true

		sop("hello".length());//5
		sop("hello".charAt(4));//o
		sop("hello".indexOf('l'));//2
		sop("hello".indexOf('l',3));//3
		sop("hello".indexOf("he"));//0
		sop("hello".lastIndexOf('l'));//3
		sop("hello".indexOf('a'));//2

		//�ַ�����ת�ַ���
		char[] arr = {'a','s','d','f'};
		String str1 = new String(arr);
		sop(str1);

		String str2 = new String(arr,1,3);
		sop(str2);

		//�ַ���ת�ַ�����
		char[] arr2 = "hhhhh".toCharArray();
		for(char ch:arr2)
		{
			sop(ch);
		}

		//�ֽ�����ת���ַ���
		byte[] arr3 = {65, 66, 67, 68};
		String str4 = new String(arr3);//����
		sop(str4);

		//�ַ���ת���ֽ�����
		byte[] arr4 = str4.getBytes();//���� GBK
		for (byte num:arr4 )
		{
			sop(num);
		}

		byte[] arr5 = "���".getBytes("UTF-8");//���� 
		for (byte num:arr5 )
		{
			sop(num);
		}

		String str5 = new String(arr5, "UTF-8");
		sop(str5);

		String s3 = "adfasfs".substring(3);//Ĭ�Ͻ�ȡ�����һ��
		String s4 = "adfasfs".substring(3,5);//������ʼ��������������
		sop(s3);
		sop(s4);

		String s5 = "aaaa".toUpperCase();
		sop(s5);
		String s6 = "AAAA".toLowerCase();
		sop(s6);

		String s7 = "    aaa   aaaa   ".trim();//ȥ�ո�
		sop(s7);

		int i = "abc".compareTo("abd");
		sop(i);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}