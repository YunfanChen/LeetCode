# 91.Decode_Ways
A message containing letters from A-Z is being encoded to numbers using the following mapping:
```
'A' -> 1
'B' -> 2
...
'Z' -> 26
```
Given a non-empty string containing only digits, determine the total number of ways to decode it.

# Example :
```
Input: "12"
Output: 2
Explanation: It could be decoded as "AB" (1 2) or "L" (12).

Input: "226"
Output: 3
Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

```



# My Solution :
```
class Solution {
    public int numDecodings(String s) {
        if(s.length()==0 || s==null) return 0;
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=s.charAt(0) != '0' ? 1:0; //没有这句A不过
        for(int i = 2; i<=n; i++){
            int one = Integer.valueOf(s.substring(i-1,i));
            int two = Integer.valueOf(s.substring(i-2,i));
            if(one<=9 && one>=1){
                dp[i] += dp[i-1];
            }
            if(two<=26 && two>=10){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}

```
