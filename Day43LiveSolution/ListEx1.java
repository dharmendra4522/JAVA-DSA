package Day43LiveSolution;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        int n =5 ;

        //Declaring the arrayList with initial size n
        ArrayList<Integer> arr1 = new ArrayList<>(n);

         //Declaring the arrayLis
        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.println("Array 1: "+ arr1);
        System.out.println("Array 2: "+ arr2);

        //Append new element at the end of the list

        for(int i=0; i <=10; i++){
            if (arr1.size() < n) {
                arr1.add(i);
            }
            
            arr2.add(i);
        }

        System.out.println("Array 1: "+ arr1);
        System.out.println("Array 2: "+ arr2);

        arr1.get(0);
        

    }
}
