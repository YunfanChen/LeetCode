# 680.Valid_Palindrome_II
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.


# Example :
```
Input: "aba"
Output: True

Input: "abca"
Output: True
Explanation: You could delete the character 'c'.

```



# My Solution :
```
class Solution {
    public boolean validPalindrome(String s) {
        int head = -1, tail = s.length();
        while(++head<--tail){
            if(s.charAt(head)!=s.charAt(tail)){
                return isPalindrome(s,head+1,tail) || isPalindrome(s,head,tail-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int head, int tail){
        while(head<tail){
            if(s.charAt(head)==s.charAt(tail)){
                head++; tail--;
            }
            else return false;
        }
        return true;
    }
}

```
