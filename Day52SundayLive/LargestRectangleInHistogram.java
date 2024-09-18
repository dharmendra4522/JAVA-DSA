package Day52SundayLive;

public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            //int h = heights[i];
            int left = i, right = i;

            // Expand to the left, but ensure left stays within bounds
            while (left >= 0 && heights[left] >= heights[i]) {
                left--;
            }

            // Expand to the right, but ensure right stays within bounds
            while (right < heights.length && heights[right] >= heights[i]) {
                right++;
            }

            // Calculate the area with the current bar as the smallest height
            int area = (right - left - 1) * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights)); // Output should be 10
    }
}
