
public class PallindromeNoProgram 
{

	public static void main(String[] args) 
	{
		int no=121,rev=0,rem,temp;
		temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(no==rev)
		{
			System.out.println(no+" pallindrome");
		}
		else
		{
			System.out.println(no+"not pallindrome");
		}
	}

}
