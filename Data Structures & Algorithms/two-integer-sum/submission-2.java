class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int incrementor = 0;
        for(int num: nums){
            map.put(num, incrementor++);
        }

        for(int i = 0; i< nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){ //need to account for duplicates
                if(i!=map.get(temp)){
                    return new int[]{i, map.get(temp)};
                }
            }
        }
        return new int[]{0,0};
    }
}
