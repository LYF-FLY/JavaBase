class Demo2
{
	public static void main(String[] args)
	{
		int x=0,y=1;
		if(++x==y--&x++==1 | --y==0)//1==1£¬x=y=1 y=0 1==1 x=2£¬y=-1£¬
			System.out.println("x="+x+",y="+y);
		else
			System.out.println("y="+y+",x="+x);
	}
}
class Demo3
{
	public static void main(String[] args)
	{
		int a=3,b=8;

		int c=(a>b)?a++:b++; //3 9 8
		System.out.println("a="+a+"\tb="+b+"\tc="+c); 

		int d=(a>b)?++a:++b; // 4 10 10
		System.out.println("a="+a+"\tb="+b+"\td="+d); 

		int e=(a<b)?a++:b++; //5 10 4
		System.out.println("a="+a+"\tb="+b+"\te="+e); 

		int f=(a<b)?++a:++b;  //f=a=4 b=9
		System.out.println("a="+a+"\tb="+b+"\tf="+f); 
	}
}
class Demo4
{
	public static void main(String[] args)
	{ 
		int m=0,n=3;
		if(m>0)
		
		    if(n>2)
			System.out.println("A");
		else
			System.out.println("B");
		
	}
}
class Demo5
{ 
	public static void main(String []args)
	{ 
		int i = 0, j = 5; 

		tp: for (;;)
		{ 
			i++; 

			for(;;)
			{
			   if(i > j--)
			      break tp; 
			}
		} 


		System.out.println("i = " + i + ", j = "+ j); 
	} 
} 		
class Demo6     
{
	public static void main(String[] args)
	{
		String foo="blue"; 

		boolean[] bar=new boolean[2]; 

		if(bar[0])
		{ 
      		    foo="green"; 
   		} 
		System.out.println(foo);
	}
}		
 class Demo7     
{ 
	public static void leftshift(int i, int j)
	{ 
   		i+=j; 
	} 
	public static void main(String args[])
	{ 
		int i = 4, j = 2; 
		leftshift(i, j); 
		System.out.println(i); 
	} 
} 
class Demo8
{ 
	public static void main(String[] args)
	{ 
		int[] a=new int[1]; 

		modify(a); 

		System.out.println(a[0]); 
	}
	public static void modify(int[] a)
	{ 
		a[0]++;
	} 
}