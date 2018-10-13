class Solution {
    private HashMap<Character,Character> map = new HashMap<Character,Character>();
    public Solution(){
        this.map.put('}','{');
        this.map.put(']','[');
        this.map.put(')','(');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(this.map.containsValue(c)){
                stack.push(c);
            }
            else if(this.map.containsKey(c)){
                if(stack.isEmpty()||stack.pop()!=this.map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}