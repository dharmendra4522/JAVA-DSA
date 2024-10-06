package Day56GreedyLive;

public class Question4 {

    // Function to calculate the maximum profit from stock prices
    public int maxProfit(int[] prices) {
        int n = prices.length;  // Get the total number of days (length of prices array)

        // Create an array to store the maximum stock prices from each day to the last day
        int[] maxValue = new int[n];

        // Initialize the last element in maxValue as the last price in the prices array
        maxValue[n-1] = prices[n-1];

        // Traverse the prices array in reverse to populate maxValue
        // maxValue[i] stores the maximum stock price from day i to the last day
        for (int i = n-2; i >= 0; i--) {
            maxValue[i] = Math.max(prices[i], maxValue[i+1]);
        }

        int ans = 0;  // Variable to store the maximum profit found so far

        // Now calculate the maximum possible profit by comparing the price on day i
        // with the maximum future price (stored in maxValue[i])
        for (int i = 0; i < n-1; i++) {
            int currPor = maxValue[i] - prices[i];  // Calculate potential profit for day i
            ans = Math.max(ans, currPor);  // Update maximum profit if current profit is higher
        }

        return ans;  // Return the maximum profit
    }

    public static void main(String[] args) {
        Question4 q = new Question4();  // Create an instance of Question4

        // Example array of stock prices
        int[] prices = {7, 1, 5, 3, 6, 4};  

        // Call maxProfit method and print the result
        System.out.println(q.maxProfit(prices));
    }
}
