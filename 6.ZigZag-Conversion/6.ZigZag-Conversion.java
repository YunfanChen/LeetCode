class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        int i = 0, index = 0;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(i = 0;i < sb.length; i++) sb[i] = new StringBuffer();
        i = 0;
        while(i<len){
            for(index = 0;index<numRows && i<len;index++){
                sb[index].append(c[i++]); 
            } 
            for(index=numRows-2;index>=1 && i<len;index--){
                sb[index].append(c[i++]);
            }
        }
        for(index=1;index<numRows;index++) sb[0].append(sb[index]);
        return sb[0].toString();
    }
}