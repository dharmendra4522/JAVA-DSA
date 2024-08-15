package Day30OOPs;

public class HierachialInherit {

    public static void main(String[] args) {
        Birds bird = new Birds();
        bird.eat();
        bird.breathe();
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

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}
