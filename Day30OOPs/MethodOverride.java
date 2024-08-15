package Day30OOPs;

public class MethodOverride {
    public static void main(String[] args) {
        Deer dr =  new Deer();
        dr.eat();  
    }
}
class Animal{
    void eat(){
        System.out.println("Animal is eating anything");
    }
}

class Deer extends Animal{
    @Override
    void eat(){
     System.out.println("eats grass");
    }
}