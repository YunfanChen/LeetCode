# 17.Letter-Combinations-of-a-Phone-Number
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
# Example:
```
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
```
# Note:


Although the above answer is in lexicographical order, your answer could be in any order you want.

# My Solution:
```
class Solution {
    public List<String> letterCombinations(String digits) {
        String[] s = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList();
        for(int num = digits.length(); --num>=0;){
            if(!Character.isDigit(digits.charAt(num))) return result;
            else ;
        }
        for(int i = 0; i<digits.length(); i++){
            result = mix(result,s[(digits.charAt(i))-'0']);
        }
        return result;
    }
    public List<String> mix(List<String> l, String s){
        List<String> mixL = new ArrayList();
        if(l.size()==0){
            for(int j = 0; j<s.length(); j++){
                mixL.add(""+s.charAt(j));
            }
        }
        for(int i =0; i<l.size(); i++){
            for(int j = 0; j<s.length(); j++){
                mixL.add(l.get(i)+s.charAt(j));
            }
        }
        return mixL;
    }
    
}
```
