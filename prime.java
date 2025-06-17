public class prime {
   
    public static void main(String[] args) {
         int num1 =17;
         System.out.println(num1 + " is prime : " + isPrime(num1));

  }

    public static boolean isPrime( int num){

        if (num <= 1)
        return false;

        else {
            for (int i=2 ; i<=num/2 ; i++){
                if (num % i ==0)
                return false;
            }
        
        }
        return true;


    }
}
