//有字符串： abccaabdsswaabbsc
//要求输出结果： a(5)b(4)c(3)d(1)s(3)w(1)
import java.util.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		String str = "abccaabdsswaabbsc";
		TreeMap<Character, Integer> map = new TreeMap<>();

		for (int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			Integer value = map.get(ch);
			if (value == null)
			{
				map.put(ch,1);
			}else
			{
				map.put(ch,value+1);//新的把旧的覆盖
			}
		}

		StringBuilder sb = new StringBuilder();
		map.forEach((k,v)->{
			sb.append(k).append("(").append(v).append(")");
		});
			System.out.println(sb);
		
	}
}
