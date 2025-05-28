package bt_01;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Tên không được để trống");
        }
        if(age < 0){
            throw new IllegalArgumentException("Tuổi không được để trống");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Tuổi không được âm");
        }
        this.age = age;
    }

    public void displayInfo(){
        System.out.printf("Tên động vật: %s, Tuổi: %d\n",name,age);
    }
    public String makeSound(){
        return  "Some generic sound";

    }
}

