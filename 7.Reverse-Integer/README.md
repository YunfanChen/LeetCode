# 7.Reverse-Integer
Given a 32-bit signed integer, reverse digits of an integer.
## Example 1
```
Input: 123
Output:  321
```
## Example 2
```
Input: -123
Output: -321
```
## Example 3
```
Input: 120
Output: 21
```
## My Solution
```
class Solution {
    public int reverse(int x) {
        int res=0;
        long num = 0;
        if(x==0) return 0;
        while(x!=0){
            res = x % 10;
            num=10*num;
            num+=res;
            if(num>Integer.MAX_VALUE||num<Integer.MIN_VALUE) return 0;
            x=x/10;
        }
        return (int)num;
    }
}
```
## What I Got
- Integer.MAX_VALUE & Integer.MIN_VALUE represent the domain of the int.
- If we want to see if the number is exceed the limit, we should use a high level format (long).
