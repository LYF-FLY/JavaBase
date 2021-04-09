import java.util.regex.*;
class Home2 
{
	public static void main(String[] args) 
	{
		String[] arr = gets();
		for(String ss:arr)
		     System.out.println(ss);
	}

	//设计一个方法，提取一个身份证号码中的生日部分。身份证号的验证规则，只需要验证前17位是数字，最后一位可以数字或者X即可。
	public static String  fun(String identity)
	{
		String regex="\\d{6}({\\d8})\\d{3}[\\dX]";

        return identity.replaceAll(regex,"$1");
	}

	//设计一个方法，将如下字符串中的所有手机号码和固话号码提取出来，存入一个数组返回。（正则） 

     //17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123

     //1.手机号码的校验: 首位是1，第二位是 3579，后面都是数字
     //2.固化校验: 区号-号码，其中区号3或4位，号码7位，且首位不能是0

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
