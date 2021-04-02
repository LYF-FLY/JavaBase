/*
�����ʱ�򲻳������е�ʱ���У������쳣
Java���쳣���������,���쳣����Ϊ�Ͳ����������ȡ���Ժͷ���
Throwable ������
	Error:��ʾ�����˵��������⣬����ѧ
	Exception:

�쳣����ʽ
		try{
		���ܷ����쳣�Ĵ���
		
		}catch(�쳣�� e)
		{
			�����쳣�Ĵ���
		}

		throws �ڷ������� �������ܷ����쳣 ���������в����������
*/
class  Demo1
{

	public static void main(String[] args) 
	{
		try{
			int[] arr = new int[3];
			//ϵͳ�Զ�����һ���쳣���� throw new Exception() �����쳣�ĺ���Ĵ���û�����У�ֱ��catch
			System.out.println(arr[3]);//main�������쳣�׸������  ����������쳣�����printStackTrace()����
		}catch(Exception e) // ��̬ Exception e = Exception e
		{
			String msg = e.getMessage();//�쳣��Ϣ
			System.out.println(msg);

			msg = e.toString();//�쳣���ƣ��쳣��Ϣ
			System.out.println(msg);

			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ���쳣λ��

			System.out.println("����Խ��");
		}
	}
		
	/*
	��Ϊ�쳣��Ͷ����ˣ����Դ������쳣�����
	main�����������쳣���쳣�׸������  ����������쳣�����printStackTrace()����
	����������ӡ�쳣�����ƣ��쳣��Ϣ���쳣������λ�ã�Ȼ���жϳ���
	*/
}

//�Զ����쳣 ����Ϊ�����쳣
/*
����throw �ֶ������쳣���� ���������д���
���ִ���ʽ

�쳣������
������ʱ�쳣	����ʱ�����쳣
			ʹ����throw��throws ���봦��
����ʱ�쳣	����ʱ�������쳣 ��Runtime�������࣬javaϣ���쳣������ʱ�����ж�
			ʹ����throw��throws ���ô���

			������Ϊ���ݴ�����ɵ��쳣����Ӧ���ó���ͣ�£��޸Ĵ�������

*/
class FuShuException extends Exception
{
	FuShuException(){}
	FuShuException(String message)
	{
		super(message);
	}
}
class MyMath
{
	public int div(int a, int b)  throws FuShuException
	{
		//try{
				if(b < 0)
					throw new FuShuException();//����throw���������д���				
		//}catch(FuShuException e)
		//{
		//	
		//}
		return a/b;
	}
}
class Demo2
{
	public static void main(String[] args) throws FuShuException
	{
		MyMath myMath = new MyMath();
		int num = myMath.div(6,-1);
	}
}

//��ȡһ��������ָ���±������ ����ʱ�쳣
class  Demo3
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,4,4,5};
		getNum(arr,7);
		System.out.println("Hello World!");
	}

	public static int getNum(int[] arr, int index)
	{
		if(index < 0 || index >= arr.length)
			throw new ArrayIndexOutOfBoundsException();
		if(arr == null)
			throw new NullPointerException();
		return arr[index];
	}
}

//ͼ�����Ϊ����Ϊ�쳣  ����ʱ�쳣�ͼ̳�RuntimeException
class AreaFuShuException extends RuntimeException
{
	AreaFuShuException(){}
	AreaFuShuException(String msg)
	{
		super(msg);
	}
}
class Rectangle
{
	private double length, width;

	Rectangle(){}

	Rectangle(double length, double width)
		{
			if(length<0 || width<0)
				throw new AreaFuShuException();
			this.length = length;
			this.width = width;
		}
}

class Demo5
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle(-2,9);
	}
}