package Day28PracticeQuestion;

public class Question4 {
    public static void main(String[] args) {
        //Convert uppercase character to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch | ' ') + " ");
            //printing abcdefghijklmanoqrstuvwxyz
        }
    }
}
