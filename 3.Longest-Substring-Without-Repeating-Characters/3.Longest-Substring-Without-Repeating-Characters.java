class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int count = 0, i = 0, j = 0;
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                count = Math.max(count,j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return count;
    }
}