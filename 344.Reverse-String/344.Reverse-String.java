class Solution {
    public String reverseString(String s) {
        String output = new String();
        for(int i = 0; i<s.length(); i++){
            output=output + String.valueOf(s.charAt(s.length()-i-1));
        }
        return output;
    }
}