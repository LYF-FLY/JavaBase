class Demo1 
{
	public static void main(String[] args) 
	{
		long num1 = 11l;
		float num2 = 1.1f;
		System.out.println(num1 + num2);
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
	int num1 = 11;
	float num2 = 1.1f;
	double num3 = 1.3;
	
	//��������ת�� �;�����߾����Զ�ת��
	double sum = num1+num2+num3;

	/*
	�Զ���������ת���Ӹ߾���תΪ�;���
	99�Ķ����ƣ�00000000 00000000 00000000 01100011
	==>������λ�����ֽڱ�Ϊ01100011
	==��99
	*/
	
	byte num5=99;
			  
	byte num6=127;
	//num6=num6+10;//�ͼ�����Զ���߼�������ת ���Ǹ߾��Ȳ�һ�����Զ�ת�;��ȣ�����Ҫǿ������ת��	
	/*
	127+10��int���͵ģ����ڴ����Բ�����ʽ������00000000 00000000  00000000  10001001
	ǿ��ת��Ϊbyte���� ���������ֽڱ�Ϊ10001001�����Ҳ�ǲ��룬��ô������һ������������ȡ����1����Ϊ������ԭ�룬��ʾ����119
	���Ըò������ĸ�������-119
	*/
	num6 = (byte)(num6+10);//�߾���ǿ��ת��Ϊ�;��� -119

	char ch = 97; //�Ӹ߾���int�Զ�ת��Ϊ�;���char����00000000 00000000 00000000 01100001�������ֽڱ�00000000 01100001

	System.out.println(num5);
	}
}

class Demo3
{

	public static void main(String[] args)
	{
		
		System.out.println(-5%-2);//-1����������ɱ�������
		
		int m=5, n;
		//�൱��m+1 n=m n+=m m+1 m-1 n+=m
		n = ++m + m++ + --m; //6 + 6 +6
		System.out.println(n);
					
	}

}

class Demo4
{

	public static void main(String[] args)
	{

			byte sum =0;
			//sum = sum+6;������
			sum+=6;//���У���Ϊ���ڲ�ǿ������ת��
			System.out.println(sum);
int a=0,b=0;
			//int a = false;java��û��ת��
			//���ʽ����������ͱ�������ֵ�����һ���ʽ�ӣ��б��ʽ������ֵ��
			System.out.println(a==b);//false
			System.out.println(a=99);//99

	}
}
class Demo5
{

	public static void main(String[] args)
	{
		//λ�������// &��
		// |��
       // ^����Ӧλ��ͬ�����1����ͬΪ0 
		//~��λȡ��
		//<< >> >>>Integer.toBinaryString()
		System.out.println(Integer.toBinaryString(~(0b111)));
		System.out.println(7^3^3);//7���ͬһ�������������ֲ���
		System.out.println(~8);//��λȡ����1��-8������1��-9

		int num1=1, num2=2, num3=3;
		
		System.out.println((num1>num2 && num1>num3) ? num1:(num2>num3  ? num2:num3));
		
	}
}
 