# 9.Palindrome-Number
Determine whether an integer is a palindrome. Do this without extra space.
## My Solution
```
class Solution {
    public boolean isPalindrome(int x) {
        if(x<10&&x>=0) return true;
        else if(x<0) return false;
        int res = 0, num = 0, x2 = x;
        while(x2!=0){
            res = x2 % 10;
            num = num*10;
            num+=res;
            x2=x2/10;
        }
        if(num != x){return false;}
        else{return true;}
    }
}
```
## What I Got
- 0-9 are all palindrome numbers.
