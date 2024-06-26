
public class UppercaseOfString {

	public static void main(String[] args)
	{
        String str = "Hello World!";
        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Print the character at index i
        	char c=str.charAt(i);
        	if(Character.isUpperCase(c))
        	{
        		System.out.print(c);
        	}
        	
	}

}
}