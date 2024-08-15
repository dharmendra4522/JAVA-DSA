package Day30OOPs;

public class ConstructorChaining {
    public static void main(String[] args) {
        Prototype pt = new Prototype();
    }

}

//parent class or base class  
class Demo{

    //base class default constructor
    Demo(){
        this(80, 90);
        System.out.println("Base class default constructor called");

    }
//base class parameterized constructor  
    Demo(int x, int y){
        System.out.println("Base class parameterized constructor called");
    }
}

//derived class or child class  
class Prototype extends Demo{
    //derived class default constructor 
    Prototype(){
        this("java", "Python");
        System.out.println("Drived class default constructor called");
    }

    //drived class parameterized constructor 
    Prototype(String str1, String str2){
        super();
        System.out.println("Drived class parameterized constructor called");
    }
}
