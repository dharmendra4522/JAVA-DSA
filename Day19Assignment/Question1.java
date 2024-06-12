package Day19Assignment;

public class Question1 {
    public static boolean twice(int num[]){
        for(int i=0; i<num.length-1;i++){
            for(int j =i+1; j<num.length; j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,1};
        System.out.println(twice(num));
        int num2[] = {1,3,4,5,6,7};
        System.out.println(twice(num2));
    }
}
