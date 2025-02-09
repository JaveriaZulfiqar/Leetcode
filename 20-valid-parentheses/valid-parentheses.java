class Solution {
    public boolean isValid(String s) {
        char []arr= s.toCharArray();
        Stack<Character> stack=new Stack<>();

        for(char ch:arr){
            if(stack.isEmpty()){
                stack.push(ch);
                }
            else{
                char top = stack.peek();
                if(ch -top== 1 || ch - top ==2){   //using ASCII table to check the values of opening closing brackets and the difference between each and automatic brackets value will be used to perform -/+
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
        }

        }
    return stack.isEmpty();
}
}