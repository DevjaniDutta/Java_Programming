public class PalindromNo {
    public static void main(String[] args) {
        
        int num = 1331;
        int OG = num ;
        int R = 0;
         while( num != 0)
        {
             R = R*10 +(num%10);
             num =num/10;

        }
        if (OG == R){
        System.out.println("Palindrome Number");
        }
        else {
            System.out.println(" Not Palindrome Number");
        }


    }
}
