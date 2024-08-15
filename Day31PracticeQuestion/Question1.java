package Day31PracticeQuestion;

public class Question1 {
    public static void main(String[] args) {
        Complex cm = new Complex(8, 5);
        Complex cm2 = new Complex(3, 8);
        Complex result = Complex.add(cm, cm2);
        result.printComplex();

    }
}
class Complex{
    int real; 
    int imag;

    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real ),(a.imag+b.imag));
        
    }


    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real -b.real),(a.imag-b.imag));
        
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
        
    }
    public void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag + "i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }

        else{
            System.out.println(real+ "+" +imag+"i");
        }
    }
}