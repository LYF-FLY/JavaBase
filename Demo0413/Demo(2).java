/*
映射关系类型（Map.Entry<K,V>）
*/
import java.util.*;
class Demo2 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new HashMap<>();
		map.put("name","lisi");
		map.put("age","20");
		map.put("add","tj");

		Set<Map.Entry<String,String>> set = map.entrySet();
		Iterator<Map.Entry<String,String>> ite = set.iterator();
		while (ite.hasNext())
		{
			Map.Entry<String, String> entry = ite.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+value);
		}
		
	}
}
