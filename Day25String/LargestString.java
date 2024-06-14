package Day25String;

public class LargestString {
    public static void main(String[] args) { //Time Cpmplexcity O(X*N)
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
