import java.util.Random;
import java.util.Scanner;

class Demo1 //找第二大的数
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
	/*
	public static int findSecondMax(int[] arr)//找第二大的值
	{
		int max = maxnum(arr);//先找到最大值
		int secondmax = 0 ;
		int start = 0;

		for(int i=0; i<arr.length; i++)//找到起始位置
		{
			if (arr[i] != max || i==arr.length-1)
			{
				secondmax = arr[i];
				start = i;
				break;
			}
		}

		
		for(int i=start; i<arr.length; i++) //找第二最大值
		{
			if(arr[i]==max)
				continue;
			if(arr[i] > secondmax)
				secondmax = arr[i];
		}
		return secondmax;
	}
	*/
	public static int findSecondMax(int[] arr)//找第二大的值优化
	{
		if(arr.length==0 || arr.length==1)
		{
			System.out.println("没有第二大的数");
			return -1;
		}

		int max=arr[0]>=arr[1]?arr[0]:arr[1];
		int secondmax = arr[0]<=arr[1]?arr[0]:arr[1];

		for (int i=2; i<arr.length; i++)//
		{
			if(arr[i]>=max)
			{
				secondmax = max;
				max = arr[i];
			}
			else if(arr[i]>secondmax || arr[i]<max)
			{
				secondmax = arr[i];
			}
			else if(max == secondmax)
			secondmax = arr[i];
				
		}

		return secondmax;
	}
	public static void main(String[] args) 
	{
		int n=10;
		int[] arr = product(n);
		System.out.println("最大值");
		System.out.println(maxnum(arr));
		System.out.println("第二最大值");

		System.out.println(findSecondMax(arr));

	}
}
