public class fac {
     public static long factorialIterative(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
        public static void main(String[] args) {
            int number = 5;
            long result = factorialIterative(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
}
