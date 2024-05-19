import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next(); //Capture only one word 
        // System.out.println(input);

        String name = sc.nextLine(); //capture all sentance or paragraph
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
    }
    
}
