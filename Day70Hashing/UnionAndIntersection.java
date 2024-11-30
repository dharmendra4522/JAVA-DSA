package Day70Hashing;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // Union Logic
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements of arr1 to the set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        
        // Add elements of arr2 to the set (fixing the bug here)
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union size = " + set.size());  // Size of the union set

        // Intersection Logic
        set.clear();  // Reset the set to contain only elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);  // Ensure each element is counted only once
            }
        }

        System.out.println("Intersection size = " + count);
    }
}
