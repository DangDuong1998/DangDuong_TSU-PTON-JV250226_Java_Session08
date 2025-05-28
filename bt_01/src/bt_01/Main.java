package bt_01;

public class Main {
    public static void main(String[] args) {
        Animals[] animalList = new Animals[10];
        Dog dog = new Dog("Buddy",3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Gray");
        animalList[0] = dog;
        animalList[1] = cat;
        for(Animals animal : animalList){
            if(animal != null){
                animal.displayInfo();
                System.out.print("Âm thanh: " + animal.makeSound());
                System.out.println("");
                System.out.println("");

            }
        }
    }
}
