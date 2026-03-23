class Solution {
    public String makeGood(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(ch-stack.peek())==32)stack.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        retrun sb.reverse().toString();
    }
}