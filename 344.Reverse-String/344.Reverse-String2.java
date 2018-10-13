class Solution {
    public String reverseString(String s) {
        if(s.length()==0) return "";
        return String.valueOf(s.charAt(s.length()-1))+reverseString(s.substring(0,s.length()-1));
    }
}