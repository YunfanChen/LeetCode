# 266.Palindrome-Permutation
Given a string, determine if a permutation of the string could form a palindrome.
# Example 1:
```
Input: "code"
Output: false
```
# Example 2:
```
Input: "aab"
Output: true
```
# Example 3:
```
Input: "carerac"
Output: true
```
# My Solution:
```
class Solution {
    public boolean canPermutePalindrome(String s) {
        int count = 0;
        for(char i = 0; i < 128 && count <= 1; i++){
            int ct = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j)==i){
                    ct++;
                }
            }
            count += ct % 2;
        }
        return count <= 1;
    }
}
```
