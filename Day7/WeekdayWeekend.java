package Day7;

import java.util.Scanner;

public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //     {
        //         System.out.println("Weekday");
        //         break;
        //     }
        //     case 2:{
        //         System.out.println("Weekday");

        //         break;
        //     }
        //     case 3:{
        //         System.out.println("Weekday");

        //         break;
        //     }
        //     case 4:{
        //         System.out.println("Weekday");

        //         break;
        //     }
        //     case 5:{
        //         System.out.println("Weekday");
        //         break;
        //     }

        //     case 6:{
        //         System.out.println("Weekend");

        //         break;
        //     }

        //     case 7:{
        //         System.out.println("Weekend");

        //         break;
        //     }

        //     default:{
        //         System.out.println("Wrong choice");
        //         break;
        //     }
        // }


        switch (day) {
            case 1,2,3,4,5:{
                System.out.println("Weekday");
                 break;
            }
            case 6,7:{
                System.out.println("Weekend");
                break;
            }
            default:{
                System.out.println("Wrong choice");
                break;
            }
              
        }


    }
}
