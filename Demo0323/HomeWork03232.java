import java.util.Random;
import java.util.Scanner;

class Demo1 //�ҵڶ������
{
	public static void show(int[] nums)//��ӡһ������
	{
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
	}
	public static int[] product(int n)//����һ�����������
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
	public static int maxnum(int[] arr)//�����ֵ
	{
		int max = arr[0];
		for (int i=0; i<arr.length; i++)
		
			if(arr[i]>max)
				max = arr[i];
		return max;
	}
	/*
	public static int findSecondMax(int[] arr)//�ҵڶ����ֵ
	{
		int max = maxnum(arr);//���ҵ����ֵ
		int secondmax = 0 ;
		int start = 0;

		for(int i=0; i<arr.length; i++)//�ҵ���ʼλ��
		{
			if (arr[i] != max || i==arr.length-1)
			{
				secondmax = arr[i];
				start = i;
				break;
			}
		}

		
		for(int i=start; i<arr.length; i++) //�ҵڶ����ֵ
		{
			if(arr[i]==max)
				continue;
			if(arr[i] > secondmax)
				secondmax = arr[i];
		}
		return secondmax;
	}
	*/
	public static int findSecondMax(int[] arr)//�ҵڶ����ֵ�Ż�
	{
		if(arr.length==0 || arr.length==1)
		{
			System.out.println("û�еڶ������");
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
		System.out.println("���ֵ");
		System.out.println(maxnum(arr));
		System.out.println("�ڶ����ֵ");

		System.out.println(findSecondMax(arr));

	}
}
