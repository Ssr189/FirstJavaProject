
public class PallindromeStringProgram 
{

	public static void main(String[] args) 
	{
		String str="mam";
		String rev="";
		int leng=str.length();
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}

}
