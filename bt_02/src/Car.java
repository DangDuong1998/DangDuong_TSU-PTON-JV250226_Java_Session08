public class Car extends Vehicle {
    public Car(String name, int speed){
        super(name,speed);

    }
    @Override
    public void displayInfo(){
        System.out.printf("Car Name: %s, Speed: %d km/h\n",getName(),getSpeed());
    }
}
