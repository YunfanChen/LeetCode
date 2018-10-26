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