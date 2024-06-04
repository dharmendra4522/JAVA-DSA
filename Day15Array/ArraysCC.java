package Day15Array;

import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[100];
        // int numbers[] = {1,2,3};
        // String fruits[] ={"apple", "mango" , "orange"};
        System.out.println("length of array= "+ marks.length);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Physics number: ");
        marks[0] = sc.nextInt();  //physics
        System.out.print("Enter the chrmistry number: ");
        marks[1] = sc.nextInt();  //chem
        System.out.print("Enter the Math number: ");
        marks[2] = sc.nextInt();  //math
      
        System.out.println("Your physics number: "+marks[0]);
        System.out.println("Your che number: "+marks[1]);
        System.out.println("your math number: "+marks[2]);


        //update 
        // marks[2]= marks[2] + 1;
        // System.out.println("your math number: "+marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");




    }
}
