class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s=="" || s.length()>12) return new ArrayList<String>();
        List<String> res = new ArrayList<>();
        String temp = "";
        dfs(s,res,temp,0,0);
        return res;
    }
    public void dfs(String s, List<String> res, String temp, int index, int dotCount){
        if(dotCount==4 && index==s.length()){
            res.add(temp);
            return;
        }
        for(int i = 1; i<4; i++){
            if(index+i>s.length()) break;
            String s2 = s.substring(index,index+i);
            if((s2.charAt(0)=='0' && s2.length()>1) || (Integer.parseInt(s2)>255)) break;
            dfs(s,res,temp+s2+((dotCount==3)?"":"."),index+i,dotCount+1);
        }
        
    }
}