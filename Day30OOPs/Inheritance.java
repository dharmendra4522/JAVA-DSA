package Day30OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat(); 
    }
}

//Base(Parent) CLass
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
// Drived(Child) Class 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
