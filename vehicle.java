public class vehicle {
    public static void main(String[] args) {
        Car car = new Car("BMW", 180, 4);
        Bike bike = new Bike("Honda", 120, true);

        System.out.println("---- Car Info ----");
        car.start();
        car.displayInfo();
        car.openTrunk();
        car.stop();

        System.out.println("\n---- Bike Info ----");
        bike.kickStart();
        bike.displayInfo();
        bike.stop();
    }
}

class Boom {
    String brand;
    int speed;

    Boom(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }

    void stop() {
        System.out.println(brand + " is stopping.");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Boom {
    int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void openTrunk() {
        System.out.println(brand + "'s trunk is open.");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Boom {
    boolean hasCarrier;

    Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    void kickStart() {
        System.out.println(brand + " is kick-started.");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}


