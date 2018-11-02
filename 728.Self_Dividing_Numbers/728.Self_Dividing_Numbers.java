class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new LinkedList();
        for(int i = left; i<=right; i++){
            if(isSelfDivid(i)) res.add(i);
        }
        return res;
    }
    public boolean isSelfDivid(int num){
        String s = String.valueOf(num);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)-'0'==0) return false;
            else if(num % (s.charAt(i)-'0')==0) continue;
            return false;
        }
        return true;
    }
}