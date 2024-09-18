package Day52SundayLive;
import java.util.*;

class Node {
    int value; 
    int span;

    public Node(int value, int span) {
        this.value = value;
        this.span = span;
    }
}

public class OnlineStockSpan {
    Stack<Node> stack; // object creation

    // Constructor matching class name
    public OnlineStockSpan() {
        stack = new Stack<>(); // object memory allocation
    }

    public int next(int price) {
        int span = 1;  // Initialize span to 1 for the current price

        // Process the stack to compute the span
        while (!stack.isEmpty() && stack.peek().value <= price) {
            span += stack.pop().span;  // Aggregate the span of consecutive smaller/equal prices
        }

        // Push the current price with its computed span onto the stack
        stack.push(new Node(price, span));

        return span;  // Return the computed span for this price
    }

    public static void main(String[] args) {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        
        System.out.println(stockSpan.next(100)); // Output: 1
        System.out.println(stockSpan.next(80));  // Output: 1
        System.out.println(stockSpan.next(60));  // Output: 1
        System.out.println(stockSpan.next(70));  // Output: 2
        System.out.println(stockSpan.next(60));  // Output: 1
        System.out.println(stockSpan.next(75));  // Output: 4
        System.out.println(stockSpan.next(85));  // Output: 6
    }
}
