// brute force
class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int l = 0; l < nums.length; l++){
            for(int r = 0; r<nums.length; r++){
                if(nums[l] == nums[r] && l!=r){
                    return true;
                }
            }
        }
        return false;
    }
}