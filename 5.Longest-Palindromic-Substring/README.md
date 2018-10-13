# 5.Longest-Palindromic-Substring
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
## Example
```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```
```
Input: "cbbd"
Output: "bb"
```
## My Solution
```
class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = palin(s,i,i);
            int len2 = palin(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start){
                start = i - (len-1)/2;
                end = i+ len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int palin(String s, int left, int right){
        while(left >= 0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)){
            left--; right++;
        }
        return right-left-1;
    }
}
```
## What I Got
- First I want to get all the substrings of the given string, and judge them wheather they are Palindromic Substring, and then to get a longest one. But, it seems exceed the time limit.
- Then I think about to inverse the string and find the longest common part with the original one. But, it doesn't work in adcmjcda (adcjmcda) or something like this.
- Finally, I choose another solution: first we choose a character, and then extend it from left and right with same character, this is also the basic concept of the Palindromic.
- First I think it needs n points (the length of the string is n) to test wheather it can extend, but, actully, it needs n(n-1) points. Why? since ABBA is also a Palindromic Substring.
- We also need two index number to help us get the substring. By the way, the important thing is in s.substring(index1,index2), the substring we get is not include the character in index2. 
- This question teached me a lot, I get more than that.
