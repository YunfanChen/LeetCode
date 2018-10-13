# 3.-Longest-Substring-Without-Repeating-Characters
Given a string, find the length of the **longest substring** without repeating characters.
## Examples:
- Given "abcabcbb", the answer is "abc", which the length is 3.
- Given "bbbbb", the answer is "b", with the length of 1.
- Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
## My Solution
```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j = i+1; j<=n;j++){
                if(isUnique(s,i,j)) count=Math.max(count,j-i);
            }
        }
        return count;
    }
    public boolean isUnique(String s, int i, int j){
        Set<Character> set = new HashSet<>();
        for(;i<j;i++){
            char c = s.charAt(i);
            if(set.contains(c)==false) set.add(c);
            else return false;
        }
        return true;
    }
}
```
**But, Time Limit Exceeded**
- Then I try to use another solution:
## Another Solution
```
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
```
## What I Got
- I used three loop to calculate all the possible outcomes first, but the run time is exceeded the limit.
- In second solution, I learned and used a **classic** algorithm **Sliding Window**.
- The comlexity is O(2n), faster than the first solution.
