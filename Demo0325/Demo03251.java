/*
�ֲ�����û��Ĭ��ֵ
��Ա������Ĭ��ֵ

�ֲ��������������Ǵ��䶨���λ�ÿ�ʼ�������ڵĴ�����
��Ա�������������������ڵ�������

�ֲ�������ջ�п����ڴ�
��Ա�����ڶ��п����ڴ�

�ֲ������ڵ������ڵĺ���������ʱ�����ڴ�
��Ա�������䴴������ʱ�����ڴ�

�ֲ��������ڵ���������������ͷ��ڴ�
��Ա������������������������ʱ�ͷ��ڴ�

*/
class Car
{
	String color;//�������������
	int num;

	public void run()//�����������Ϊ
	{
		System.out.println("��");
	}
}
//�����ж���ı����ǳ�Ա����
//�����ж���ķ����ǳ�Ա����
class  Demo1
{
	public static void main(String[] args) 
	{
		Car benchi = new Car();//���۴洢��new Car�����ڶ��п����ڴ�ĵ�ַ

		benchi.color = "white";
		benchi.num = 4;
		benchi.run();
		System.out.println("���۵���ɫ" + benchi.color + "���۵�����" + benchi.num);
	}
}

class  Demo2
{
	public static void main(String[] args) 
	{
		Car benchi = new Car();//���۴洢��new Car�����ڶ��п����ڴ�ĵ�ַ

		benchi.color = "white";
		benchi.num = 4;
		benchi.run();
		System.out.println("���۵���ɫ" + benchi.color + "���۵�����" + benchi.num);
	}
}