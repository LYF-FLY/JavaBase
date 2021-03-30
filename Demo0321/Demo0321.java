class  Test1
/*1.已知学生成绩以100分为满分，共分5个等级：A,B,C,D,E。
   90～100为等级A，80～89为等级B，70～79为等级C，
   60～69为等级D，0～59为等级E。*/
{
	public static void main(String[] args) 
	{
		int score = 100;

		if(score>=90 && score<=100)
			System.out.println("A");
		else if(score>=80 && score<=89)
			System.out.println("B");
		else if(score>=70 && score<=79)
			System.out.println("C");
		else if(score>=60 && score<=69)
			System.out.println("D");
		else if(score>=0 && score<=59)
			System.out.println("E");
		else
			System.out.println("输入错误");

	}
}

class Test2
/**/
{

	public static void main(String[] args)
	{
		   int i=3;
		switch(i) //byte int short char 字符串
		{	
			default:
				i+=2; //5
			case 1: //只能是一个具体的值
				i+=1; //6
			case 4:
				i+=8;	//14	
			case 2:
				i+=4; //18
		}

		System.out.println("i="+i);  //18
	}
}

class Test3
{

	public static void main(String[] args)
	{
		int x=0,y=1;

		if(++x == y--  &  x++ == 1  || --y==0)//1==1 & 1==1 x=2 y=0 ||后面不执行

			System.out.println("x="+x+",y="+y); 
		else
			System.out.println("y="+y+",x="+x);
	}
}

class Test4
{

	public static void main(String[] args)
	{
		int n=2012;
		if(n%4==0 && n%100!=0)
			System.out.println("yes");
		else if(n%400 == 0)
			System.out.println("yes");
		else
			System.out.println("NO");
	}
}

class Test5
{

	public static void main(String[] args)
	{
		int n=153;
		int sum=0, b=0, s=n;

		for(int i=0; i<3; i++)
			{
				b = s%10;
				s /= 10;		
				sum += b*b*b;
			}
		if(sum == n)
			System.out.println("Yes");
	}
}

class Test6
{

	public static void main(String[] args)
	{
		int count=0;
		
		for (int i=100; i>=100 && i<=999; i++ )
		{
			int s=i, a=0;
			if(i%3 == 0)
			{
				for(int j=0; j<3; j++)
					{
						a = s%10; //取余
						s /= 10;
						if(a == 5)
							{
								System.out.println(i);
								count++;
								break;
							}
							
					}
						
			}
		}
		System.out.println(count);
	}
}

class Test7
{

	public static void main(String[] args)
	{
		int count=0;
for (int i =200; i>=200 && i<=400 ; i++ )
{
			if(i%3==0 && i%7!=0)
				{
					System.out.println(i);
					count++;
				}
}
		System.out.println(count);
	}
}

