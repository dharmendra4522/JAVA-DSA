package Day30OOPs;

public class GetterSetterMethod {
    public static void main(String[] args) {
         // Creating objects of the class
         Pen p1 = new Pen(); //Created Pen Object call p1
         p1.setColor("Blue");
         System.out.println(p1.getColor());
         p1.setTip(5);
         System.out.println(p1.getTip());
         p1.setColor("yellow");
         System.out.println(p1.getColor());
      
 
    }
}

class Pen{
    private String color;
    private int tip;
    
    String getColor(){
        return this.color;  
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int Tip){
        this.tip = Tip;
    }
}
