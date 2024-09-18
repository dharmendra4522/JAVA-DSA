package Day51LivePractice;

import java.util.Stack;

public class TrappingRainWater {
    public int trap(int[] height){
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for(int i=0; i<height.length; i++){
            while(st.isEmpty()==false && height[st.peek()] < height[i]){
                int m = st.pop();
                if(st.isEmpty()==true){
                    break;
                }
                int l = st.peek();
                int h = Math.min(height[i], height[l])- height[m];
                int w = i - l - 1;
                ans += h*w;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        TrappingRainWater t = new TrappingRainWater();
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(t.trap(height)); // 9

    }
}
