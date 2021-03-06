enum Gender
{
	MALE("男"),FEMALE("女");
	private String desc;

	Gender(){}

	Gender(String desc)
	{
		this.desc = desc;
	}
	
	public static Gender getGender(String sex)
	{
		if("男".equals(sex))
			return Gender.MALE;
		else if("女".equals(sex))
			return Gender.FEMALE;
		else
		return null;
	}

	public String toString()
	{
		return desc;
	}

}
class Person
{
	private String name;
	private Gender gender;

	Person(){}
	Person(String name, Gender gender)
	{
		this.name = name;
		this.gender = gender;
	}

	public void setGender(String gender)
	{
		this.gender = Gender.getGender(gender);
	}

	public String toString()
	{
		return "Person{name = " + this.name + "gender = " +gender+"}";
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{
		Person per = new Person("李四",Gender.MALE);
		System.out.println(per);
		per.setGender("女");
		System.out.println(Gender.getGender("男"));
	}
}
