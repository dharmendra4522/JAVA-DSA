import java.util.*;
public class P3Print1Ton {
    public static void main(String[] args) {
        //print number from 1 to n

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int limit = sc.nextInt();
        int counter = 1;
        while(counter <= limit){
            System.out.print(counter + " ");
            counter ++;
        }

    }
    
}
