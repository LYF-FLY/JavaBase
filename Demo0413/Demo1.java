/*
map 键值对，键不可以重复，值不能重复，键和值都可以为null
Set<K> Map.keySet(): 得到所有的键，存到一个Set集合中，利用迭代器，根据键去找值
*/
import java.util.*;
class  Demo1
{
	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<>();
		String value = map.put("name","lisi1");
		value = map.put("name","lisi2"); //返回的是这次的值lisi2，因为把之前的覆盖了

		map.putIfAbsent("name","zhangsan");//没出现的键才能加进去

		Map<String,String> map2 = new HashMap<>();
		 map2.put("name","lisi1");
		 map2.put("name1","lisi1");
		 map2.put("name2","lisi1");

		 map.putAll(map2);

		 //map.remove("name");//根据键删除，返回值
		 //map.remove("name1","lisi1");//返回true或者false
		 //map.clear();//删除所有

		 map.replace("name","zhangsan");

		 map.replaceAll((t,u)->{
			if("name".equals(t))
				return "zhangsan";
			return u;
		 });

		 String v = map.get("name");

		 map.getOrDefault("name","lisi7");//获取到了就用获取值，否则用默认值

		 sop(map.size());

		 Collection coll = map.values();//获得所有值的集合
		 sop(coll);

		 boolean boo = map.containsKey("name");

		 Set<String> set = map.keySet();
		 Iterator<String> ite = set.iterator();
		 while(ite.hasNext())
		{
			String key = ite.next();
			String value2 = map.get(key);
			sop(value2);
		}


		 








		
	}
	public  static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
