class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> j = new HashSet<>();
        int res = 0;
        for(int i = 0; i<J.length(); i++){
            j.add(J.charAt(i));
        }
        for(int i = 0; i<S.length(); i++){
            if(j.contains(S.charAt(i))){
                res++;
            }
        }
        return res;
    }
}