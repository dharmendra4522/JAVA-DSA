package Day30OOPs;

public class MultileveInterface {

    public static void main(String[] args) {
        Beer b = new Beer();
        b.eat();
        b.walk();
    }
}

interface Harbivore {
    public void eat();
}

interface Carivore {
    public void eat();
}
//Multiple inheritance using comos -->
class Beer implements Harbivore, Carivore{
    @Override
    public void eat() {
        System.out.println("Beer is omnivorous");
    }
    
    void walk() {
        System.out.println("Beer is walking...");
    }
}