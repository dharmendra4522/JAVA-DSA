import java.util.Arrays;
public class Question4 {
    // public static boolean anagramsString(String str1, String str2){
    //     // If lengths are different, they cannot be anagrams
    //     if(str1.length() != str2.length()){
    //         return false;
    //     }

    //     //convert string to character arrays
    //     char[] charArray1 = str1.toCharArray();
    //     char[] charArray2 = str2.toCharArray();

    //     // Sort the character arrays
    //     Arrays.sort(charArray1);
    //     Arrays.sort(charArray2);

    //     // Compare sorted character arrays
    //     return Arrays.equals(charArray1, charArray2);

    // }
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
        // System.out.println(anagramsString(str1, str2));

        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        //First check - if the length are the same
        if(str1.length() == str2.length()){
            //Convert Strings to char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if the sorted char arrays are same or identical then the string are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");

            } 
            
        } 
        else{
            //case when lengh are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}
