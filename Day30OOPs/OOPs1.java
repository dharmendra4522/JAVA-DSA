package Day30OOPs;

public class OOPs1 {
    public static void main(String[] args) {
        // Creating objects of the class
        Pen p1 = new Pen(); //Created Pen Object call p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("yellow");
        System.out.println(p1.color);
        p1.color="Pink";
        System.out.println(p1.color);

    }
}


class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age; 
    float precentage;

    void clacPercentage(int phy, int chem, int math){
        precentage = (phy + chem + math) / 3;
    }
}