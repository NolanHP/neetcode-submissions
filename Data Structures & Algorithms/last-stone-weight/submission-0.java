class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stoneList = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones){
            stoneList.offer(stone);
        }
        while(!stoneList.isEmpty()){ // double check because 1 item is allowed
            if(stoneList.size() == 1){
                return stoneList.peek();
            }
            int largestStone = stoneList.poll();
            int secondStone = stoneList.poll();
            System.out.println("largest: " + largestStone);
            System.out.println("second largest: " + secondStone);
            if(largestStone-secondStone!=0){
                stoneList.offer(largestStone-secondStone);
            }
        }
        
        return 0;
    }
}
