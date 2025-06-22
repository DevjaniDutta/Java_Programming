import java.util.Scanner;

public class calculater {
    
    public int add (int a,int b) {
        int sum = a+b;
        return sum;

    }

     public double add (double a,double b) {
        double sum = a+b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculater cal = new calculater();

        System.out.println("Choose the type of addition:");
        System.out.println("1. Integer Addition");
        System.out.println("2. Double Addition");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first integer: ");
                int n1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int n2 = scanner.nextInt();
                int sumInt = cal.add(n1, n2);
                System.out.println("Sum of two integers: " + sumInt);
                break;

            case 2:
                System.out.print("Enter first double: ");
                double d1 = scanner.nextDouble();
                System.out.print("Enter second double: ");
                double d2 = scanner.nextDouble();
                double sumDouble = cal.add(d1, d2);
                System.out.println("Sum of two doubles: " + sumDouble);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
