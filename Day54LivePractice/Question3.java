package Day54LivePractice;

import java.util.*;

class Job {
    String id;  // Job ID
    int deadline;  // Deadline of the job
    int profit;  // Profit associated with the job

    // Constructor
    public Job(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Question3 {

    // Function to schedule jobs to maximize profit
    public static void jobScheduling(List<Job> jobs, int n) {
        // Step 1: Sort jobs in descending order of profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find the maximum deadline to know the number of available slots
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create an array to keep track of free time slots
        String[] result = new String[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        // Step 4: Try to schedule jobs in the latest possible slot
        int totalProfit = 0;
        for (Job job : jobs) {
            // Find a slot from job.deadline-1 to 0
            for (int j = Math.min(maxDeadline - 1, job.deadline - 1); j >= 0; j--) {
                if (!slot[j]) { // If the slot is free
                    slot[j] = true; // Mark the slot as occupied
                    result[j] = job.id; // Schedule the job
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Print the scheduled jobs and the total profit
        System.out.print("Scheduled Jobs: ");
        boolean hasJobs = false; // To check if any job was scheduled
        for (String jobId : result) {
            if (jobId != null) {
                System.out.print(jobId + " ");
                hasJobs = true;
            }
        }
        if (!hasJobs) {
            System.out.print("None");
        }
        System.out.println();
        System.out.println("Total Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        // Sample Input: Job ID, Deadline, Profit
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("a", 4, 20));
        jobs.add(new Job("b", 1, 10));
        jobs.add(new Job("c", 1, 40));
        jobs.add(new Job("d", 1, 30));

        // Total number of jobs
        int n = jobs.size();

        // Call the job scheduling function
        jobScheduling(jobs, n);
    }
}
