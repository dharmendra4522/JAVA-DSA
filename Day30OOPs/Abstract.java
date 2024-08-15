package Day30OOPs;

public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);

        Mustang myHourse = new Mustang();
        //Animal -> Hourse -> Mustang
       
    }
}

abstract class Animal{
    String color;

    //constractor
    Animal(){
        System.out.println("Animal constructor called..");
    }
    void eat(){
        System.out.println("Animal is eating");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor calles");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Horse is walking on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called.");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Chicken is walking on 2 legs");
    }
}