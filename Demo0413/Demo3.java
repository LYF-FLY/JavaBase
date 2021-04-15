/*
hashmap还是依靠的hashcode和eqauls方法判断键是否相同
所以要重写类的hashcode和equals方法,让姓名年龄相同就是同一个鉴
*/
import java.util.*;

class Student
{

}
class Demo3 
{
	public static void main(String[] args) 
	{
		//当存在映射关系，使用map
		//每个学生对应一个住址
		Map<Student, String> map = new HashMap();
		System.out.println("Hello World!");
	}
}
