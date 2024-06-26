
public class RemoveSpacecInString {

	public static void main(String[] args) 
	{
		String str = " This is my java code ";
		System.out.println(str);
	    String nowhiteSpace=str.replaceAll("\\s","");
	    System.out.println(nowhiteSpace);
		// for (int i = 0; i < str.length(); i++) {
	            
	        //    if((str.charAt(i)!=' ') && (str.charAt(i)!='\t' ))
	          //  {
	            //	nowhiteSpace=nowhiteSpace + str.charAt(i);
	           	
	           // }

	//}

		// System.out.println(nowhiteSpace);
		 
}
}