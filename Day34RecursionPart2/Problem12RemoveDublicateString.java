package Day34RecursionPart2;

public class Problem12RemoveDublicateString {
    public static void removeDublicate(String str, int idx, StringBuilder newStr, boolean map[]){
       //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDublicate(str, idx+1, newStr, map);

        }
        else{
            map[currChar-'a'] = true;
            removeDublicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDublicate(str, 0, new StringBuilder(""), new boolean [26]);
    }
}
 