/*
有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括姓名，三门课成绩），
输入的格式：如：zhagnsan，30，40，60计算出总成绩，
并把学生的信息和计算出的总分数高低顺序存放在磁盘文件"stud.txt"中。

*/
import java.io.*;
import java.util.*;
class Home 
{
	public static void main(String[] args)throws IOException 
	{
		Set<Student>  students = StudentTool.getStudents(Collections.reverseOrder());

		StudentTool.saveInfo(students,"stud.txt");
	}

}
class StudentTool
{  
	//获取学员信息
	public static Set<Student> getStudents()
	{
		return getStudents(null);
	}
    

	//获取学员信息
	public static Set<Student> getStudents(Comparator<Student> com)
	{
		Scanner sc=new Scanner(System.in);
		Set<Student> students=null;
        if(com==null)
		   students=new TreeSet<>();
		else
           students=new TreeSet<>(com);

		String str = null;
		for(int i=1;i<=3;i++)
		{
			System.out.println("请输入第"+i+"个学员的信息");
            str=sc.nextLine();

            String[] arr=str.split(",");

			students.add(new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3])));
		}

		return students;
	}

	//把学员信息存储到文件
	public static void saveInfo(Set<Student> students,String file)throws IOException
	{
		FileWriter fw=new FileWriter(file);

		for(Student stu:students)
		{
			fw.write(stu.toString()+"\t");
			fw.write(stu.getSum()+"");
			fw.write("\r\n");
		}

		fw.close();
	}


}
class Student implements Comparable<Student>
{
	private String name;
	private int cn,math,eng;
	private int sum;

	Student(){}

	Student(String name,int cn,int math,int eng)
	{
		this.name=name;
		this.cn=cn;
		this.math=math;
		this.eng=eng;
		sum=cn+math+eng;

	}
	public int compareTo(Student stu)
	{
		int num = stu.sum-this.sum;
		return num==0?this.name.compareTo(stu.name):num;
	}

	public int getSum()
	{
		return sum;
	}

	public String toString()
	{
		return name+","+cn+","+math+","+eng;
	}
}
