public class reverseString {

    public static void main(String[] args) {
        String S = "Hello";
        String revS ="";
        for (int i = S.length() - 1 ; i >= 0 ;i--){
            revS += S.charAt(i);
        }
        System.out.println(revS);
    }   
        
}
    

