/*
����Ա���������������õĶ���������ʱ����Ϊstatic
���÷���û���õ�������ķǾ�̬��Աʱ����Ϊstatic
��Ϊ��̬���ڷǾ�̬��ǰ�����ڴ�,���Ծ�̬�����޷����÷Ǿ�̬��Ա����


*/
class  Demo1
{
	public static void main(String[] args) //�൱��һ����̬����
	{
		System.out.println(args[0]);
	}

	public static void main(int a) //�൱��һ����̬����
	{
		System.out.println(a);
	}
}

class Demo2
{
	public static void main(String[] args)
	{
		String[] str ={"hahahha"};
		int a = 99;
		Demo1.main(str);
		Demo1.main(a);	
	}	
}
class Demo3
{
		public static void main(String[] args)
	{
		int[] arr= {1,2,4,5,21};
		int index = ArrayTool.halfFind(arr, 21);
		System.out.println(index);
	}	

}