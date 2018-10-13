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