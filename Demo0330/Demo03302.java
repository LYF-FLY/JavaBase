/*
�ӿڣ�
interface �ӿ���
{
	public static finanl ��Ա������ //������Ĭ�����ε�
	public abstract ��Ա������//Ĭ������Ϊ���󷽷�
}

�ӿ��ǿ�������ͬ�ķ��������õĿ϶�����������д�ķ���

�����֮���Ǽ̳й�ϵ
  ͨ���̳п��Եõ��ü̳���ϵ�еĹ��Ե����Ժͷ���
��ͽӿ���ʵ�ֹ�ϵ
  ����ʵ�ּ̳���û�еĶ���

 
*/
interface Inter
{
	//int num = 66; �������ò���ȷ
	void fun();//���δʲ�дҲ��Ĭ�ϵ�
}
interface Inter2
{
	int num = 66;
	void fun();//���δʲ�дҲ��Ĭ�ϵ�
}
class Person implements Inter, Inter2
{
	public void fun()
	{
		System.out.println(this.num);
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{
		Person per = new Person();
		per.fun();
		System.out.println(Inter2.num);
		System.out.println(Person.num);
	}
}
