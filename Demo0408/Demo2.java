/*
�������ʽ����
1��ƥ�䣺ʹ�õ���String��matches����
2���иʹ�õ���String��split����Strinf[] split(String regex)

*/
class Demo2 
{
	public static void main(String[] args) 
	{
		tihuan();
	}

	public static void tihuan()
	{
		String ss= "zhangsa*****ahhah$$$$$";
		String str = ss.replaceAll("(.)\\1+","$1"); //���ֶ�εķ���ֻʣһ��
		System.out.println(str);
		ss = "asdlfjlsdk2345345sdfgjk";
		str = ss.replaceAll("\\d{7,}","*****");//7λ���ϵ������滻Ϊ����
		System.out.println(str);
		ss = "12134344353";
		str =ss.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1***$2");//
		System.out.println(str);
	}
	//split
	public static void qie()
	{
		String ss = "z,s,a,a";
		String regex = ",";
		String[] arr = ss.split(regex);

		String ss1 = "z.s.a.a";
		String regex1 = "\\.";//������.�и��Ϊÿһ���ַ�����Ϊ�и������
		String[] arr1 = ss1.split(regex1);

		String ss2 = "z   s   a    a";
		String regex2 = " +";//�ո����һ�λ���
		String[] arr2 = ss2.split(regex2);

		String ss3 = "z***s###a$$$$$$a";
		String regex3 = "(.)\\1+";//����
		String[] arr3 = ss3.split(regex3);

		for(String str: arr)
		{
			System.out.println(str);
		}
		for(String str1: arr1)
		{
			System.out.println(str1);
		}
		for(String str2: arr2)
		{
			System.out.println(str2);
		}
		for(String str3: arr3)
		{
			System.out.println(str3);
		}

	}
}