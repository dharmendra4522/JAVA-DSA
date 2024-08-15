package Day30OOPs;

public class HybrideInherit {
    public static void main(String[] args) {
        Birds bird = new Birds();
        bird.eat();
        bird.breathe();

        Cat ct = new Cat();
        ct.eat();
        ct.walk();
    }
}

// Base(Parent) Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived(Child) Class
class Mammals extends Animal {

    void walk() {
        System.out.println("walks");
    }
}
class Cat extends Mammals{
    void sound(){
        System.out.println("meows");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}
class Shark extends Fish{
    void eatFish(){
        System.out.println("Eats Fish");
    }
}
class Birds extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}

class Peecock extends Birds{
    void dance(){
        System.out.println("Dance");
    }
}
