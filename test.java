package garimachikaramam;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		class GFG
		{
		 
		    static boolean isVowel(char c)
		    {
		        return (c == 'a' || c == 'e' || c == 'i'
		                 || c == 'o' || c == 'u');
		    }
		 
		    static int longestVowel(String str)
		    {
		        int count = 0, res = 0;
		        char[] s = str.toCharArray();
		         
		        for (int i = 0; i < s.length; i++)
		        {
		 
		            // Increment current count
		            // if s[i] is vowel
		            if (isVowel(s[i]))
		            count++;    
		 
		            else
		            {
		                // check previous value
		                // is greater then or not
		                res = Math.max(res, count);
		 
		                count = 0;
		            }
		        }
		         
		    return Math.max(res, count);
		    }
		 
		// Driver code
		public static void main (String[] args)
		{
		    String s = "theeare";
		    System.out.println(longestVowel(s));
		}
		}
	}

}
