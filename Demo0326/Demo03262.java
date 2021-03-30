//�Լ���װ��
/*
ͨ�����췽��˽�л�ʹ���޷���������
��Ϊ��Ա������δʹ�÷Ǿ�̬��Ա�������еķ�������Ϊ��̬����
*/
/**
���û�С�javaԭ�룬ֻ��.class����Ҫһ���ĵ�˵����ʲô����
@author lyf
@version 1.0
*/
public class ArrayTool 
{
	private ArrayTool()
	{}
	/**
		���������ֵ�Ĺ���
		@param int[] ����һ����������
		@return int ����һ�����ֵ
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
	���Ƕ��ֲ���
	@param int[] ����һ����������
	@param int ���ܱ����ҵ���
	@return int ���ر��ҵ�����ֵ�±�
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
