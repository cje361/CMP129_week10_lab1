public class VehicleTest {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        Truck truck = new Truck("Ford", "F-150", 2020);

        System.out.println("----- Vehicle 1 -----");
        car.displayType();
        car.displayInfo();

        System.out.println();
        System.out.println("----- Vehicle 2 -----");
        truck.displayType();
        truck.displayInfo();
    }
}