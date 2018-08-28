class Solution {
    public int removeElement(int[] nums, int val) {
        
        int length = 0;
        
        for (int x: nums){
            if (x != val){
                nums[length] = x;
                length++;
            }
        }
        
        return length;
    
    }
}