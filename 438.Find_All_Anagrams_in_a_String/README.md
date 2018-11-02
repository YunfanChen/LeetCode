# 438.Find_All_Anagrams_in_a_String
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

# Example 1 :
```
Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc". 

```
# Example 2 :
```
Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```


# My Solution :
```
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int plen = p.length();
        int slen = s.length();
        if(plen>slen) return res;
        
        int[] hash = new int[26];
        for(char c : p.toCharArray()){
            hash[c-'a']++;
        }
        int count = plen;
        int start = 0, end = 0;
        while(end<slen){
            if(hash[s.charAt(end)-'a']>=1){
                count--;
            }
            hash[s.charAt(end)-'a']--;
            end++;
            if(count==0){
                res.add(start);
            }
            if(end-start==plen){
                if(hash[s.charAt(start)-'a']>=0){
                    count++;
                }
                hash[s.charAt(start)-'a']++;
                start++;
            }
        }
        return res;
    }
}

```
