# 10.Regular-Expression-Matching
Implement regular expression matching with support for '.' and '*'.
```
'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
```
## My Solution
```
class Solution {
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() && 
                               (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        
        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) || 
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}
```
## Solution 2:
```
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for(int i = 1; i < dp[0].length; i++){
            if(p.charAt(i-1)=='*') dp[0][i]=dp[0][i-2];
        }
        for(int i = 1; i<dp.length; i++){
            for(int j = 1; j<dp[0].length; j++){
                if(p.charAt(j-1)=='.'||p.charAt(j-1)==s.charAt(i-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-2];
                    if(p.charAt(j-2)=='.'||s.charAt(i-1)==p.charAt(j-2)){
                        dp[i][j]=dp[i][j]|dp[i-1][j];
                    }
                }
                else dp[i][j]=false;
            }
        }
        return dp[s.length()][p.length()];
    }
}
```
