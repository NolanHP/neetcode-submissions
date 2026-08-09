class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        
        Stack<Character> symbol = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            int symb = s.charAt(i);

            switch(symb){
                case '{' -> symbol.push('{');
                case '(' -> symbol.push('(');
                case '[' -> symbol.push('[');
            }
            if(symbol.isEmpty()){return false;}
            switch(symb){
                case '}' -> {
                    if(symbol.peek() == '{' ){symbol.pop();}
                    else{return false;}
                    }
                case ')' -> {
                    if(symbol.peek() == '('){symbol.pop();}
                    else{return false;}
                    }
                case ']' -> {
                    if(symbol.peek() == '['){symbol.pop();}
                    else{return false;}
                }
            }

            
        }
        return(symbol.isEmpty());

    }
}
