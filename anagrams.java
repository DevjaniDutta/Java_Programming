import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String S1 = "listen";
        String S2 = "silent";
        if (S1.length() != S2.length())
        {
            System.out.println("Given strings are not anagrams");
        }
        else{
            char[] C1 = S1.toCharArray();
            char[] C2 = S2.toCharArray();
            Arrays.sort(C1);
            Arrays.sort(C2);
            if (Arrays.equals(C1, C2))
            {
                System.out.println("Given strings are anagrams");
            }
            else
            {
                System.out.println("Given strings are not anagrams");
            }
        }
        
        }
        
    }   

