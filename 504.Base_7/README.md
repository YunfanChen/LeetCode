# 504.Base_7
Given an integer, return its base 7 string representation.
# Example 1 :    
```
Input: 100
Output: "202"
```
# Example 2:
```
Input: -7
Output: "-10"
```
# My Solution
```
class Solution {
    public String convertToBase7(int num) {
        if(num<0) return "-" + convertToBase7(-num);
        if(num<7) return num + "";  
        else{
            return convertToBase7(num/7) + num % 7 + "";
        }
    }
}
```
