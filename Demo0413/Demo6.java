//数组转集合 集合转数组
import java.util.*;
class  Demo6
{
	public static void main(String[] args) 
	{
		String[] arr = {"aaa","add"};
		List<String> list = Arrays.asList(arr);

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("java");
		list1.add("java");

		String[] arr1 = list.toArray(new String[list.size()]);
		int i =arr1.length;
		System.out.println(i);
	}
}
