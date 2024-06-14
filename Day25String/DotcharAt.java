package Day25String;

public class DotcharAt {

    //method of print all letter od Strings
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String firstName = "Dharmendra";
        String lastName = "Vishvkarma";
        String fullName = firstName + " " + lastName;

        //Access individual letter
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(1));
        System.out.println(fullName.charAt(4));

        //Acces All letter usind traverse 
        printLetters(fullName);
    }
}
