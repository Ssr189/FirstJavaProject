package stringProgram;

public class CountOccurenceOfCharInString 
{

	public static void main(String[] args) 
	{
		String s="Java Progamming Java Oops";
		int totalcount=s.length();
		int totalCountafterremove=s.replace("a","").length();
		int count= totalcount - totalCountafterremove;
		System.out.println("Total count of a:-" +count);
		
		
	}

}
