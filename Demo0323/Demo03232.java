import java.util.Random;
import java.util.Scanner;

class  Demo1//数组
{
	public static void tiqu(int[] nums)
	{
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
	}
	public static void dayin(int n)
	{
		Random ran = new Random();
		int[] nums = new int[n];

		for(int i=0; i<n; i++)
		{
			nums[i]=ran.nextInt(100);
		}
		tiqu(nums);
		
	}
	public static void main(String[] args) 
	{
		
		int n =10;
		 dayin(n);

	

		
	}
}
class Demo2
{

	public static void main(String[] args)
	{
		int[] arr =new int[5];
		arr[0]  = 66;
		show(arr);
		System.out.println(arr[0]);
	}

	public static void show(int[] a)//传过来的是arr所指向的首地址的值，所以只能改变数组内容，而不能改变arr变量本身的值，除非把arr的地址传过来
	{
		a = new int[3]; //重新给a赋值一个新的地址
		a[0] = 77;
	}
}
class Demo3//交换两个数2021/3/23
{
	public static void swap(int[] arr)
	{
		int temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

	public static void main(String[] args)
	{
		
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		swap(arr);
		System.out.println("first  "+arr[0]+"   second  "+arr[1]);
	}
}
class  Demo4
{
	public static void show(int[] nums)//打印一个数组
	{
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
	}
	public static int[] product(int n)//产生一个随机数数组
	{
		Random ran = new Random();
		int[] nums = new int[n];

		for(int i=0; i<n; i++)
		{
			nums[i]=ran.nextInt(100);
		}
		show(nums);

		return nums;
		
	}
	public static int maxnum(int[] arr)//找最大值
	{
		int max = arr[0];
		for (int i=0; i<arr.length; i++)
		
			if(arr[i]>max)
				max = arr[i];
		return max;
	}
	public static int find(int[] arr, int key)//找下标
	{
		int i=0;
		for (; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		//if(i==arr.length)
			return -1;
	}

	public static void main(String[] args) 
	{
		
		int n =10;
		 int[] arr = product(n);
		 System.out.println("最大值");
		 System.out.println(maxnum(arr));

			System.out.println("请输入一个数寻找它的位置");
		 Scanner sc = new Scanner(System.in);
		 int key = sc.nextInt();
		  System.out.println(find(arr, key));



		
	}
}