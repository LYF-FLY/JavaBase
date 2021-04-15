class Student
{
	private String name;
	private int math;
	private int english;
	private int chinese;

	Student(){}
	Student(String name,int math,int english,int chinese)
	{
		this.name = name;
		this.math = math;
		this.englis = english;
		this.chinese = chinese;
	}

	public int sum()
	{
		return math+english+chinese;
	}

}

class Test 
{
	public static void main(String[] args) 
	{
		String str = "li,20,29,10";
		String str = "si,20,29,11";
		String str = "zh,20,29,12";
		String str = "san,20,29,12";
		String str = "zh,20,29,12";

		System.out.println("Hello World!");
	}
}
