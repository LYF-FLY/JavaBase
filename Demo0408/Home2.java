import java.util.regex.*;
class Home2 
{
	public static void main(String[] args) 
	{
		String[] arr = gets();
		for(String ss:arr)
		     System.out.println(ss);
	}

	//���һ����������ȡһ�����֤�����е����ղ��֡����֤�ŵ���֤����ֻ��Ҫ��֤ǰ17λ�����֣����һλ�������ֻ���X���ɡ�
	public static String  fun(String identity)
	{
		String regex="\\d{6}({\\d8})\\d{3}[\\dX]";

        return identity.replaceAll(regex,"$1");
	}

	//���һ���������������ַ����е������ֻ�����͹̻�������ȡ����������һ�����鷵�ء������� 

     //17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123

     //1.�ֻ������У��: ��λ��1���ڶ�λ�� 3579�����涼������
     //2.�̻�У��: ����-���룬��������3��4λ������7λ������λ������0

	public static String[] gets()
	{
		String str="17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123";

		String regex="1[3579]\\d{9}|\\d{3,4}-[^0]\\d{6}-";

		Pattern pattern=Pattern.compile(regex);

		Matcher matcher=pattern.matcher(str);


        String data=null;
		StringBuilder sb= new StringBuilder();
		while(matcher.find())
		{
			 data = matcher.group();
			 if(data.endsWith("-"))
				  data = data.substring(0,data.length()-1);

			 sb.append(data).append(",");
		}

        String str2=sb.toString();
		String[] arr= str2.split(",");

		return arr;
	}
}
