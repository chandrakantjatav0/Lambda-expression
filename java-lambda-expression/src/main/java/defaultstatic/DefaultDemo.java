package defaultstatic;

//********************* Default & Static Method *******************
interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlaramOn() {
        return "Turning Vehicle Alaram On.";
    }

    default String turnAlaramOf() {
        return "Turning Vehicle Alaram Of.";
    }

    static String getCompany() {
        return "#Mercedez!";
    }
}

class Car implements Vehicle {

    @Override
    public String getBrand() {
        return "$Mercedez Benz$";
    }

    @Override
    public String speedUp() {
        return "The Car is Speeding up ";
    }

    @Override
    public String slowDown() {
        return "The Car is Slowing Down";
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println("car Brand : "+vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());

        System.out.println(vehicle.turnAlaramOn());
        System.out.println(vehicle.turnAlaramOf());

        System.out.println("Car Company : "+ Vehicle.getCompany());
    }
}
