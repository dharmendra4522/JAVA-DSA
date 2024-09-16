package Day48Stack;
import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        //take a index 
        int idx =0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        //pop all elements from stack and print them
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            //add at last in result
            result.append(curr);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
       String str = "HelloWorld";
       System.out.println("Before Reverse the string: "+str);
       String resutl = reverseString(str);
       System.out.println("After reverse the String: "+resutl);


        

    }
}
