# 14.Longest-Common-Prefix
Write a function to find the longest common prefix string amongst an array of strings.
## My Solution
```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String com = strs[0];
        for(int i = 1;i<strs.length;i++)
            while(strs[i].indexOf(com)!=0)
                com=com.substring(0,com.length()-1);
        return com;
    }
}
```
## What I Got
- int indexOf (String str): Returns the index of the first occurrence of the specified substring in this string.
- Int indexOf(String str, int startIndex): Returns the index of the first occurrence of the specified substring in this string, starting at the specified index.
- int lastIndexOf(String str) : Returns the index of the specified substring appearing on the rightmost side of this string.
- int lastIndexOf (String str, int startIndex): Searches backward from the specified index, returns the index of the last occurrence of the specified substring in this string.
