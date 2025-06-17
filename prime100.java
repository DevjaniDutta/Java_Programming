public class prime100 {
    public static void main(String[] args) {
        
       for (int n=0 ;n<=100 ;n++){
        if(isPrime(n)){
        System.err.println(n);
       }
    }
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