class Solution {
    public int myAtoi(String str) {
        if(str.isEmpty()) return 0;
        int i = 0,sign = 1;
        long num = 0;
        while(str.charAt(i)==' ') i++;
        if(str.charAt(i)=='-'||str.charAt(i)=='+'){
            sign = (str.charAt(i++)=='-')? -1:1;
        }
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            num = num*10;
            num+=(str.charAt(i++)-'0');
            if(num>Integer.MAX_VALUE){return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;}
        }
        return (int)num*sign;
    }
}