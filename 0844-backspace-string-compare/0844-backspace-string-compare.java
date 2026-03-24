class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && c=='#') stack.pop();
            else if(!(c=='#')) stack.push(c);
        }
        System.out.println(stack);
        for(char c:t.toCharArray()){
            if(!st.isEmpty() && c=='#') st.pop();
            else if(!(c=='#'))st.push(c);
        }System.out.println(st);
        return (stack.equals(st));

    }
}