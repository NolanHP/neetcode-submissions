class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet numList = new HashSet<Integer>();
        for(int i = 0; i<nums.length;i++){
            numList.add(nums[i]);
        }
        if(numList.size()!=nums.length){
            return true;
        }
        return false;
    }
}