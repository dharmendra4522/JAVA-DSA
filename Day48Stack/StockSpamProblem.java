package Day48Stack;
import java.util.*;

public class StockSpamProblem {
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        //first day values alwas 1
        span[0]= 1;

        s.push(0);

        //claculate the span one after one day
        for(int i =1; i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;


            } else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;

            }
            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];
        stockSpan(stock, span);

        for(int i =0; i<span.length; i++){
            System.out.println(span[i]+" ");
        }
        
    }
}
