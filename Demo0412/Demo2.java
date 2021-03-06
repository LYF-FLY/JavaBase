/*
TreeSet：底层是二叉树数据存储，Set结尾所以无序
			具备排序功能:加入到里面的对象是能比较大小的
			1、添加到集合的对象所属的类要实现Comeparable接口中的comepareTo方法
			集合是依据该方法的返回值来确定谁大谁小返回值为零证明二者相同

*/
class Student implements Comparable
{
	private String name;
	private int age;

	Student(){}
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return this.name + this.age;
	}

	public int compareTo(Object obj) //二叉树的插入根据这个方法返回值判断两个值谁大谁小
	{

		//return 0;//一样
		return 1;
	}
}
class Demo2 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add("sdf");
		ts.add("dfsd");
		ts.add("sfasf");
		System.out.println(ts);
	}
}
