
public class ReverseStringProgram
{

	public static void main(String[] args)
	{
		String str="java";
		System.out.println("Original String:- " +str);
		int leng=str.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev + str.charAt(i);
		}
		System.out.println("Reverse String:- " +rev);
	}

}
