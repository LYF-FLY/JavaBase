//������ʽ ר������ַ���
//�ж�qq���Ƿ�Ϸ�
class Demo1 
{
	public static void main(String[] args) 
	{
		String qq = "123456";
		boolean boo = checkQQ(qq);
		System.out.println(boo);

		String regex = "[1-9][0-9]{4,14}";//������ʽ [0-9] == \\d {4,}���ٳ����ĴΣ���Ĳ���
		String regex2 = "b��o+k*"; //��ʾ�м�o����һ�λ��Σ� b����0��1�� k���ֶ��

		boo = qq.matches(regex);
		System.out.println(boo);
	}

	public static boolean checkQQ(String qq)
	{
		int len = qq.length();

		if(len >= 5 && len<=15)
		{
			if(!qq.startsWith("0"))
			{
				try{
					long hao = Long.parseLong(qq);
					return true;
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else
			System.out.println("0��ͷ��");
		}
		else
			System.out.println("���Ȳ��Ϸ�");

		return false;
	}
}
