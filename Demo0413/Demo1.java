/*
map ��ֵ�ԣ����������ظ���ֵ�����ظ�������ֵ������Ϊnull
Set<K> Map.keySet(): �õ����еļ����浽һ��Set�����У����õ����������ݼ�ȥ��ֵ
*/
import java.util.*;
class  Demo1
{
	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<>();
		String value = map.put("name","lisi1");
		value = map.put("name","lisi2"); //���ص�����ε�ֵlisi2����Ϊ��֮ǰ�ĸ�����

		map.putIfAbsent("name","zhangsan");//û���ֵļ����ܼӽ�ȥ

		Map<String,String> map2 = new HashMap<>();
		 map2.put("name","lisi1");
		 map2.put("name1","lisi1");
		 map2.put("name2","lisi1");

		 map.putAll(map2);

		 //map.remove("name");//���ݼ�ɾ��������ֵ
		 //map.remove("name1","lisi1");//����true����false
		 //map.clear();//ɾ������

		 map.replace("name","zhangsan");

		 map.replaceAll((t,u)->{
			if("name".equals(t))
				return "zhangsan";
			return u;
		 });

		 String v = map.get("name");

		 map.getOrDefault("name","lisi7");//��ȡ���˾��û�ȡֵ��������Ĭ��ֵ

		 sop(map.size());

		 Collection coll = map.values();//�������ֵ�ļ���
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
