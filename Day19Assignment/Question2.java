package Day19Assignment;

public class Question2 {
    public int  Search(int[] nums, int target){
        int min = minSearch(nums);
        
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int num[] = {1,5,3,6,2};
        System.out.println(containsDuplicate(num));
    }
}
