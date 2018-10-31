class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        String res = "";
        while(idx<s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int times = 0;
                while(Character.isDigit(s.charAt(idx))){
                    times = times*10 + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(times);
            }
            else if(s.charAt(idx)=='['){
                resStack.push(res);
                res = "";
                idx++;
            }
            else if(s.charAt(idx)==']'){
                StringBuilder sb = new StringBuilder(resStack.pop());
                int times = countStack.pop();
                for(int i = 0; i<times; i++){
                    sb.append(res);
                }
                res = sb.toString();
                idx++;
            }
            else res += s.charAt(idx++);
        }
        return res;
    }
}