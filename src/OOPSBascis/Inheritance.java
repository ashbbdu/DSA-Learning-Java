package OOPSBascis;

class Vehicle {
    public void honk () {
        System.out.println("Honkkk !!!");
    }
}

class Car extends  Vehicle {
    private String numberOfCar;
    public  Car (String numberOfCar) {
//        this.numberOfCar = "KA01FS0101";
        this.numberOfCar = numberOfCar;

    }

    public void printCarNumber () {
        System.out.println(numberOfCar);
    }

    @Override
    public void honk () {
        System.out.println("Honkkkk honkkk");
    }

//    public void honk () {
//        System.out.println("Honkkk !!!");
//    }
}

class Bus extends Vehicle {
    private String numberOfBus;
    public  Bus (String numberOfBus) {
//        this.numberOfBus = "KA01FS0101";
        this.numberOfBus = numberOfBus;

    }

    public void printBusNumber () {
        System.out.println(numberOfBus);
    }
//
//    public void honk () {
//        System.out.println("Honkkk !!!");
//    }
}




public class Inheritance {
    public static void main(String[] args) {
        Car c1 = new Car("KA01FS0101");
        c1.printCarNumber();
        c1.honk();
        Bus b1 = new Bus("UP41AU7823");
        b1.printBusNumber();
        b1.honk();
    }
}
