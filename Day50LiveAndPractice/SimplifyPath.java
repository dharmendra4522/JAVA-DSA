//SimpliFy Path 
package Day50LiveAndPractice;
import java.util.*;
public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home/user/Documents/../Pictures/..."));
    }

    public static String simplifyPath(String path){
        // path = "/was/dfgf/kjh/.././.../husgf//";
        //array = ["was", "dfgf", "kjh", ".", "..", "husgf", ""];
        String array[] = path.split("/");
        String output = "/"; int i=0;
        Stack<String> stack = new Stack<>();
        // for(int j=0; j< array.length; j++){
        //     array[j].equals();
        // }
        for(String s : array){
            if(s.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
                else
                    continue;
            }
            else if(s.equals(".") || s.isEmpty() || s.equals("/")){
                continue;
            } 
            else
                stack.push(s);
        }
        while(!stack.isEmpty()){
            array[i++] = stack.pop();
        }
        for(int j=i-1; j>= 0; j--){
            if(j != 0){
                output = output + array[j] + "/";

            } else{
                output = output +array[j];
            }
        }
        return output;
    }
    
}
