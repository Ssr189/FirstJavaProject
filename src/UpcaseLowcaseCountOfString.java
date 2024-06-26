
public class UpcaseLowcaseCountOfString {

	public static void main(String[] args) 
	{
		String str = "Hello, World!";
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        
        // Print the counts
        System.out.println("Uppercase characters: " + uppercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCount);
    }
	}


