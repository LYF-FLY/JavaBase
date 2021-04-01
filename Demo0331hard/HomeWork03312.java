/*
1.利用接口做参数，写个计算器，能完成加减乘除运算
.定义一个接口 Compute，含有一个计算方法 int compute(int a, int b)
.设计一个类 UseCompute，含有方法 public void useCom(Compute com, int one, int two)，此方法能够用传递过来的对象调用 compute 方法完成运算，并输出计算的结果。
.设计一个主类 Test，调用 UseCompute 中的方法 useCom 来完成加减乘除运算。*/
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
			System.out.println(str +"添加失败");
	}
	public void add(int index, String str)
	{
		if(mul[mul.length-1] != null)
			System.out.println("容器已满");
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
				System.out.println("没有"+str+"这个元素");
		}
	}
	public void remove(int index)
	{
		if(mul[index]==null)
			System.out.println("该下标为空");
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
			System.out.println("容器越界");
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
        // 1. 实例化一个容器对象
        MutableArray array = new MutableArray();
        // 2. 添加元素
        array.add("hello");		// 将 hello 添加到容器里
       array.add("world");		// 将 world 添加到容器里
        // 3. 插入元素
        array.add(1, "lily"); 	// 将 lily 插入到下标为1的位置
        // 4. 删除元素
        array.remove("lily");	// 删除容器中的从前往后第一个 lily
        // 5. 删除元素
        array.remove(1);		// 删除下标为 1 的元素
        // 6. 删除元素
        array.clear();			// 清空所有
        // 7. 修改元素
        array.set(1, "lucy");	 // 将第1位的元素修改为 lucy
        // 8. 获取元素
        String ele = array.get(1);// 获取容器中的第 1 位的元素 
        // 输出容器中的所有元素，格式如： 
        // [lily, lucy, hello, world]
        System.out.println(array);	
    }
}