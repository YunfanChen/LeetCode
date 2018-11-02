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