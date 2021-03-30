//设置一个圆和点类，判断点是否在圆内，点有一个方法，计算点和点的加和
import java.util.Arrays;
class CPoint//定义一个点
{
	private int x;
	private int y;

	public void setCordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int[] getCordinate()
		{
			int[] cor = new int[2];
			 cor[0] = x;
			 cor[1] = y;
			 return cor;
		}

	public CPoint add(CPoint p)
	{
		CPoint pn = new CPoint();
		int xn, yn;
		int[] cor = p.getCordinate();

		xn = this.x+cor[0];
		yn = this.y+cor[1];
		pn.setCordinate(xn, yn);

		return pn;

	}
}
class Circle 
{
	private CPoint heart; 
	private double banjing;

	public void setHeart(CPoint heart)
	{
		 this.heart=heart;
	}
	public int[] getHeart()
	{
		return heart.getCordinate();
	}

	public void setBanjing(double banjing)
	{
		this.banjing = banjing;
	}
	public double getBanjing()
	{
		return banjing;
	}

	public boolean isHave(CPoint point)
	{
		double sum = 0;

		int[] arr1 =  point.getCordinate();
		int[] arr2 =  getHeart();

		for (int i=0; i<arr1.length; i++)
		{
			sum += (arr1[i] - arr2[i])*(arr1[i] - arr2[i]);
		}
		if(sum <= banjing)
			return true;
		else
			return false;
	}
}

class Demo1
{
	public static void main(String[] args)
	{
		Circle cir =new Circle();
		

		CPoint p1 = new CPoint();
		p1.setCordinate(0, 0);

		CPoint p2 = new CPoint();
		p2.setCordinate(0,0);

		cir.setHeart(p1);
		cir.setBanjing(1);
	
		boolean boo = cir.isHave(p2);
		System.out.println(boo);

		CPoint p3 = new CPoint();
		p3 = p1.add(p2);
		System.out.println(Arrays.toString(p3.getCordinate()));

	}
}