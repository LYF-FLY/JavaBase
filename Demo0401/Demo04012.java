/*
�ɱ����:����λ�ڲ����б�����һ��
*/
class  Demo1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		add(1,1,1,1,1,1,1,1);

		"hello".concat("world");//Liangjie 

		String str = "ww,rr,ee,ff";//�и�
		String[] arr = str.split(",");

		String s2 = String.join(",","�ǺǺ�","haha");//�ö���ƴ��

		String s3 = String.format("%10s%2d%.2f%6c","hello",55,12.12345,'c');//��ʽ������Щ������ռλ��
		sop(s3);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void add(int ... a)//�����������
	{
		int sum = 0;
		for (int num:a )
		{
			sum += num;
		}
	}
}
