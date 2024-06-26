package stringProgram;

public class DuplicateCharOfString 
{

	public static void main(String[] args) 
	{
		String str="TestingAutomation";
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate character in String are :" +ch[j]);
					count++;
				}
			}
		}
		System.out.println("Duplicate character count:" +count);

	}

}
