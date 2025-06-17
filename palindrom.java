public class palindrom {
  public static void main(String[] args) {
     String S="MADAM";
     String R ="";
    for (int i = S.length() -1; i >= 0 ; i--) {
     R  += S.charAt(i); 
    }
    if (S.equals(R)){
        System.out.println("Palindrom");
    }
    else{
        System.out.println(" Not Palindrom"); 
    }        
     }
  }

