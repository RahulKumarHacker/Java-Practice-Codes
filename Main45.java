package EclipseJavaCodes;
//it may be wrong
import java.util.*;
import java.lang.*;

public class Main45{
    
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        
            

    }

}
