/*
finally��Ĵ�����return ֮ǰִ�У����ҿ϶�ִ��
*/
class Teacher
{
	Computer computer;
	Teacher()
	{
		this.computer = new Computer();
	}
	public void teach() throws ManException
	{
		try
		{
			computer.run();
		}
		catch (LanPingException e)
		{
			System.out.println(e.getMessage());
			throw new ManException("��������");
			return;
			//System.exit(1);
		}
		finally
			{
				System.out.println("tuichu");
			}
		
	}
}
class Computer
{
	int state = 1;
	public void run() throws LanPingException
	{
		if(state == 1)
			throw new LanPingException("������");
	}
}
class LanPingException extends Exception
{
	LanPingException(){}
	LanPingException(String message)
		{
			super(message);
		}

}
class ManException extends Exception
{
	ManException(){}
	ManException(String message)
	{
		super(message);
	}

}
class Demo1 
{
	public static void main(String[] args) 
	{
		Teacher tea = new Teacher();

		try{
			tea.teach();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
		}
		
	}
}
