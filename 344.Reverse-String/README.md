# 344.Reverse-String
Write a function that takes a string as input and returns the string reversed.
# Example 1:
```
Input: "hello"
Output: "olleh"
```
# Example 2:
```
Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
```
# My Solution 1:
```
class Solution {
    public String reverseString(String s) {
        String output = new String();
        for(int i = 0; i<s.length(); i++){
            output=output + String.valueOf(s.charAt(s.length()-i-1));
        }
        return output;
    }
}
```
# My Solution 2:
```
class Solution {
    public String reverseString(String s) {
        if(s.length()==0) return "";
        return String.valueOf(s.charAt(s.length()-1))+reverseString(s.substring(0,s.length()-1));
    }
}
```
# My Solution 3:
```
class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(String.valueOf(s.charAt(s.length()-1-i)));
        }
        return sb.toString();
    }
}
```
# My Solution 4:
```
class Solution {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
```
Solution 1 and 2 are all exceed time limit, in solution 3 and 4, I used StringBuilder and finally accept.
