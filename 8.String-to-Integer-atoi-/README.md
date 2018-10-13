# 8.String-to-Integer-atoi-
Implement atoi to convert a string to an integer.
## My Solution
```
class Solution {
    public int myAtoi(String str) {
        if(str.isEmpty()) return 0;
        int i = 0,sign = 1;
        long num = 0;
        while(str.charAt(i)==' ') i++;
        if(str.charAt(i)=='-'||str.charAt(i)=='+'){
            sign = (str.charAt(i++)=='-')? -1:1;
        }
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            num = num*10;
            num+=(str.charAt(i++)-'0');
            if(num>Integer.MAX_VALUE){return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;}
        }
        return (int)num*sign;
    }
}
```
## What I Got
- I think we only need to handle four cases:  
1. discards all leading whitespaces
2. sign of the number
3. overflow
4. invalid input
- We cannot return sign multiply Integer.MAX_VALUE, when we do this, Integer.MAX_VALUE will be (Integer.MAX_VALUE-1) to calculate.
