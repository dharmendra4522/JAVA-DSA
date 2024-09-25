package Day55Gready;
import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

       
        int activity[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;       // Activity index
            activity[i][1] = start[i]; // Start time
            activity[i][2] = end[i];   // End time
        }

        // Sorting activities by their end time
        Arrays.sort(activity, Comparator.comparingInt(o -> o[2]));

        // Activity selection logic
        int maxAct = 1;  // At least one activity is selected (the first one)
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activity[0][0]);  // Add the first activity (the earliest end time)
        int lastEnd = activity[0][2];  // End time of the last selected activity

        // Iterate through remaining activities
        for (int i = 1; i < end.length; i++) {
            // Select activity if its start time is after or at the end time of the last selected activity
            if (activity[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];  // Update the last end time
            }
        }

        // Output the maximum number of activities and the activities selected
        System.out.println("Max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
