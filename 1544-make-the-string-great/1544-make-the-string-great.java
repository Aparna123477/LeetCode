class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
        if(!stack.isEmpty() && (Character.toLowerCase(ch)==Character.toLowerCase(stack.peek()) &&
             Character.isUpperCase(ch) &&
              Character.isLowerCase(stack.peek())))
            {stack.pop();}


            else if(!stack.isEmpty() && ( Character.isLowerCase(ch) &&
             Character.isUpperCase(stack.peek()) &&
              Character.toLowerCase(ch)==Character.toLowerCase(stack.peek()) ))
             {stack.pop();
             }


            else{
                stack.push(ch);
            }


        }
        StringBuilder str=new StringBuilder("");
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();

        
    }
}