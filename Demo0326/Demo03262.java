//自己封装类
/*
通过构造方法私有化使得无法创建对象
因为成员方法中未使用非静态成员所以所有的方法定义为静态方法
*/
/**
如果没有。java原码，只有.class就需要一个文档说明有什么功能
@author lyf
@version 1.0
*/
public class ArrayTool 
{
	private ArrayTool()
	{}
	/**
		这是求最大值的功能
		@param int[] 接受一个整型数组
		@return int 返回一个最大值
	*/
	public static int getMax(int[] arr) 
	{
		int max = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	/**
	这是二分查找
	@param int[] 接受一个整型数组
	@param int 接受被查找的书
	@return int 返回被找到的数值下标
	*/
	public static int halfFind(int[] arr, int key) 
	{
		int min = 0, max = arr.length-1, mid;

		while(min <= max)
		{
			mid = (min+max)/2;
			if(key<arr[mid])
				max=mid-1;
			else if(key>arr[mid])
				min=mid+1;
			else
				return arr[mid];
		}
		return -1;
	}
}
