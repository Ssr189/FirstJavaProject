
public class StringDigitsFirstThenChar 
{

	public static void main(String[] args)
	{
		String str="NO26 Found";
        String character="";
        String digits="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                //digits +=ch;
               
                digits= digits+ch;
                
            }
            else
            {
                character +=ch;
            }
        }
            String result= digits + character;
            System.out.println(result);
    }
	}
