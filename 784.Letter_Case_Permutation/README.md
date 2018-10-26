# 784.Letter_Case_Permutation
Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.

```
Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]
```

# My Solution BFS:
```
class Solution {
    public List<String> letterCasePermutation(String S) {
        if(S == null) return new ArrayList<String>();
        Queue<String> q = new LinkedList<>();
        q.offer(S);
        for(int i = 0; i<S.length(); i++){
            if(Character.isDigit(S.charAt(i))) continue;
            int size = q.size();
            for(int j = 0; j<size; j++){
                String cur = q.poll();
                char[] c = cur.toCharArray();
                c[i] = Character.toUpperCase(c[i]);
                q.offer(String.valueOf(c));
                c[i] = Character.toLowerCase(c[i]);
                q.offer(String.valueOf(c));
            }
        }
        return new LinkedList<String>(q);
    }
}
```
# My Solution DFS:
```
class Solution {
    public List<String> letterCasePermutation(String S) {
        if(S==null) return new ArrayList<String>();
        List<String> result = new ArrayList<>();
        helper(S,result,0);
        return result;
    }
    public void helper(String S, List<String> result, int position){
        if(position==S.length()){
            result.add(S);
            return;
        }
        if(S.charAt(position)<='9' && S.charAt(position)>='0'){
            helper(S,result,position+1);
            return;
        }
        char[] c = S.toCharArray();
        c[position] = Character.toUpperCase(c[position]);
        helper(String.valueOf(c),result,position+1);
        c[position] = Character.toLowerCase(c[position]);
        helper(String.valueOf(c),result,position+1);
    }
}
```