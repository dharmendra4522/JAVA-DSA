package Day30OOPs;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() { // Define a constructor
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown";
        //super(); // Call the (super class or imidate class)Animal class constructor
        System.out.println("Horse constructor is called");
    }
}
