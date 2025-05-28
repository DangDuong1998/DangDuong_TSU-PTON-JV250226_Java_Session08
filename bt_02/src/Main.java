public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota",120);
        car.start();
        car.displayInfo();
        Bike bike = new Bike("Yamaha",80);
        bike.start();
        bike.displayInfo();
    }

}
