package Day51LivePractice;
import java.util.*;

public class DecodeString {
    public static String decodeString(String s) {
        //for numerical value storage
        Stack<Integer> numStack = new Stack<>();
        //for character storage
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num=0;
        for( char ch : s.toCharArray()){
            if(ch >='0' && ch<='9'){
                int digit = ch-'0';
                num = num*10 + digit;
            }
            else if(ch == '['){
                st.push(sb);
                sb = new StringBuilder();
                numStack.push(num);
                num=0;
            }
            else if(ch == ']'){
                StringBuilder temp = sb;
                sb = st.pop();
                int count = numStack.pop();

                while(count>0){
                    sb.append(temp);
                    count--;
                }
                
            }
            else{
                sb.append(ch);
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]")); 
    }
    
}
