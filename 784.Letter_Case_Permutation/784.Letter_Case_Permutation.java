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