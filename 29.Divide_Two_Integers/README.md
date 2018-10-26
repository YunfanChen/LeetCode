# 29.Divide_Two_Integers
Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero.

# Example 1:
```
Input: dividend = 10, divisor = 3
Output: 3
```
# Example 2:
```
Input: dividend = 7, divisor = -3
Output: -2
```
# My Solution
```
class Solution {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) sign=-1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        long sub = ldivisor,result = 0;
        int cur = 1;
        while(ldividend >= ldivisor){
            if(ldividend >= sub){
                ldividend -= sub;
                result += cur;
                cur = cur << 1;
                sub = sub << 1;
            }else{
                cur = cur >> 1;
                sub = sub >> 1;
            }
        }
        if(result>=Integer.MAX_VALUE-1) 
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        return (sign == 1) ? (int)result : (int)-result;
    }
}
```
