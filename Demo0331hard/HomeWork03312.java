/*
1.���ýӿ���������д��������������ɼӼ��˳�����
.����һ���ӿ� Compute������һ�����㷽�� int compute(int a, int b)
.���һ���� UseCompute�����з��� public void useCom(Compute com, int one, int two)���˷����ܹ��ô��ݹ����Ķ������ compute ����������㣬���������Ľ����
.���һ������ Test������ UseCompute �еķ��� useCom ����ɼӼ��˳����㡣*/
interface Compute
{
	int compute(int a, int b);
}
class UseCompute
{
	public void useCom(Compute com, int one, int two)
	{
		int result = com.compute(one, two);
		System.out.println(result);
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		Compute jia = new Compute(){
			public int compute(int a, int b)
			{
				return a+b;
			}
		};
		Compute jian = new Compute(){
			public int compute(int a, int b)
			{
				return a-b;
			}
		};
		Compute cheng = new Compute(){
			public int compute(int a, int b)
			{
				return a*b;
			}
		};
		Compute chu = new Compute(){
			public int compute(int a, int b)
			{
				return a/b;
			}
		};
		UseCompute use = new UseCompute();

		use.useCom(jia, 1, 2);
		use.useCom(jian, 1, 2);
		use.useCom(cheng, 1, 2);
		use.useCom(chu, 1, 2);
	}
}


//

class MutableArray
{
	int n = 5;
	String[] mul;
	
	MutableArray()
	{
		mul = new String[n];
	}

	public void add(String str)
	{
		int i = 0;
		for (; i<mul.length; i++)
		{
			if(mul[i]==null)
			{
				mul[i] = str;
				break;
			}
				
		}
		if(i == mul.length)
			System.out.println(str +"���ʧ��");
	}
	public void add(int index, String str)
	{
		if(mul[mul.length-1] != null)
			System.out.println("��������");
		else
			{
				for(int i=mul.length-2; i>=index; i--)
					mul[i+1]=mul[i];
				mul[index] = str;
			}
	}
	public void remove(String str)
	{
		for (int i=0; i<mul.length; i++)
		{
			if(mul[i]==str)
			{
				for (int j=i+1; j<mul.length; j++)
				{
					mul[j-1]=mul[j];
				}
				mul[mul.length-1]=null;
				break;
			}
			else
				System.out.println("û��"+str+"���Ԫ��");
		}
	}
	public void remove(int index)
	{
		if(mul[index]==null)
			System.out.println("���±�Ϊ��");
		else
		{
			for (int i=index; i<mul.length-1; i++)
			{
				mul[i] = mul[i+1];
			}
			mul[mul.length-1]=null;
		}

	}
	public void clear()
	{
		for (int i=0; i<mul.length; i++)
		{
			mul[i] = null;
		}
	}
	public void set(int n, String str)
	{
		if(n>mul.length)
			System.out.println("����Խ��");
		else
			mul[n-1] = str;
	}
	public String get(int n)
	{
		return mul[n-1];
	}
	public String toString()
	{
		String str = "[";
		for (int i =0; i<mul.length-1; i++)
		{
			str= str+mul[i]+", ";
		}
		str += mul[mul.length-1]+"]";
		return str;
	}

}
class Test {
	public static void main(String[] args) {
        // 1. ʵ����һ����������
        MutableArray array = new MutableArray();
        // 2. ���Ԫ��
        array.add("hello");		// �� hello ��ӵ�������
       array.add("world");		// �� world ��ӵ�������
        // 3. ����Ԫ��
        array.add(1, "lily"); 	// �� lily ���뵽�±�Ϊ1��λ��
        // 4. ɾ��Ԫ��
        array.remove("lily");	// ɾ�������еĴ�ǰ�����һ�� lily
        // 5. ɾ��Ԫ��
        array.remove(1);		// ɾ���±�Ϊ 1 ��Ԫ��
        // 6. ɾ��Ԫ��
        array.clear();			// �������
        // 7. �޸�Ԫ��
        array.set(1, "lucy");	 // ����1λ��Ԫ���޸�Ϊ lucy
        // 8. ��ȡԪ��
        String ele = array.get(1);// ��ȡ�����еĵ� 1 λ��Ԫ�� 
        // ��������е�����Ԫ�أ���ʽ�磺 
        // [lily, lucy, hello, world]
        System.out.println(array);	
    }
}