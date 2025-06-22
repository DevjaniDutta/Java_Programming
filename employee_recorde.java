public class employee_recorde {
      public static void main(String[] args) {
        Developer dev = new Developer("Dibyendu", 150000, 100000);
        Tester tester = new Tester("Devjani", 100000, 50000);

        System.out.println("---- Developer Details ----");
        dev.displayDetails();

        System.out.println("\n---- Tester Details ----");
        tester.displayDetails();
    }
}

abstract class Employee {
    String name;
    int baseSalary;

    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract int calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Developer extends Employee {
    int bonus;

    Developer(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    int calculateSalary() {
        return baseSalary + bonus;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Tester extends Employee {
    int bugFixIncentive;

    Tester(String name, int baseSalary, int bugFixIncentive) {
        super(name, baseSalary);
        this.bugFixIncentive = bugFixIncentive;
    }

    int calculateSalary() {
        return baseSalary + bugFixIncentive;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Tester");
        System.out.println("Bug Fix Incentive: " + bugFixIncentive);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

