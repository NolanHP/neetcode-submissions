class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        for(int i = 0; i< s.length(); i++){
            pq1.offer(s.substring(i,i+1));
            pq2.offer(t.substring(i,i+1));
        }

        while(!pq1.isEmpty()){
            System.out.println(pq1.peek() + pq2.peek());
            if(!pq1.poll().equals(pq2.poll())){
                return false;
            }
        }
        return true;
    }
}
