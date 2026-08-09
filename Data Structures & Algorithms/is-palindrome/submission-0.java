class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> reverse = new Stack<>();
        Queue<Character> forward = new LinkedList<>();
        int size = 0;

        for(int i = 0; i< s.length(); i++){
            char charLet = s.charAt(i);
            if(Character.isLetterOrDigit(charLet)){ 
                reverse.push(Character.toLowerCase(s.charAt(i)));
                forward.offer(Character.toLowerCase(s.charAt(i)));
                size++;
            }
        }
        System.out.println(reverse);
        System.out.println(forward);

        for(int i = 0; i< size; i++){
            if(!reverse.pop().equals(forward.poll()))
                return false;
        }
        return true;

    }
}
