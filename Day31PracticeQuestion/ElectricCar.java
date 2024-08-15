package Day31PracticeQuestion;

public class Question2 {
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}
class Automobile{
    private String drive(){
        return "Driving vehicle";
    }
}

class Car extends Automobile{
    protected String drive(){
        return "Driving car";
    }
}

public class ElectricCar extends Car{
    @Override
    public final String drive(){
        return "drive electric car";
    } 
}


//This code is not compile