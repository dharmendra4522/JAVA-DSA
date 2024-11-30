package Day68Heap; // Define the package

import java.util.PriorityQueue; // Import the PriorityQueue class

public class Comparator { // Class declaration
    // Static nested class Student implementing Comparable interface
    static class Student implements Comparable<Student> { // Overriding
        String name; // Variable to hold the student's name
        int rank;    // Variable to hold the student's rank

        // Constructor to initialize Student object
        public Student(String name, int rank) {
            this.name = name; // Set the name of the student
            this.rank = rank; // Set the rank of the student
        }

        // Override the compareTo method to define natural ordering
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Compare based on rank
        }
    }

    public static void main(String[] args) {
        // Create a priority queue to store Student objects
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // Add Student objects to the priority queue
        pq.add(new Student("A", 4)); // Add student A with rank 4
        pq.add(new Student("B", 5)); // Add student B with rank 5
        pq.add(new Student("C", 2)); // Add student C with rank 2
        pq.add(new Student("D", 12)); // Add student D with rank 12

        // Loop until the priority queue is empty
        while (!pq.isEmpty()) {
            // Peek at the head of the queue and print the name and rank
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // O(1)
            // Remove the head of the queue
            pq.remove();  
        }
    }
}
