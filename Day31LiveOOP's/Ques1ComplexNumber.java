package Day31LiveOOP;

import java.util.*;

class Complex {
    int real;
    int imag;

    public Complex() { // default constructor

    }

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        Complex c = new Complex(0, 0);
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;

        return c;

    }

    public static Complex sub(Complex a, Complex b) {
        Complex c = new Complex(0, 0);
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;

        return c;

    }

    public static Complex multi(Complex a, Complex b) {
        Complex c = new Complex(0, 0);
        int x = a.real;
        int y = a.imag;

        int p = b.real;
        int q = b.imag;

        c.real = x * p - y * q;
        c.imag = x * q + y * p;

        return c;
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }

}

public class Ques1ComplexNumber {
    public static void main(String[] args) {
        Complex a = new Complex(7, 8);
        Complex b = new Complex(2, 5);

        Complex m = Complex.add(a, b);
        m.printComplex();

        Complex n = Complex.sub(a, b);
        n.printComplex();

        Complex o = Complex.multi(a, b);
        o.printComplex();

    }

}
