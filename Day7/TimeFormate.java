package Day7;

import java.util.Scanner;

public class TimeFormate {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int day = sc.nextInt();  
      int hour = sc.nextInt();  
      int minuts = sc.nextInt();  
      
      hour += 5;
      minuts += 30;

      if(minuts>=60){
        hour++;
        minuts -= 60;
      }
      if(hour>=24){
        day++;
        hour -= 24;
      }
      System.out.println("Day: "+ day + ", Hours: " + hour + ", Minuts: " + minuts);
    }
}
