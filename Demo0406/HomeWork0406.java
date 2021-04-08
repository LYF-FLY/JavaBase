enum Gender
{
	MALE("��"),FEMALE("Ů");
	private String desc;

	Gender(){}

	Gender(String desc)
	{
		this.desc = desc;
	}
	
	public static Gender getGender(String sex)
	{
		if("��".equals(sex))
			return Gender.MALE;
		else if("Ů".equals(sex))
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
		Person per = new Person("����",Gender.MALE);
		System.out.println(per);
		per.setGender("Ů");
		System.out.println(Gender.getGender("��"));
	}
}