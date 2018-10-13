class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='I') num+= (num>=5)? (-1):1;
            if(s.charAt(i)=='V') num+=5;
            if(s.charAt(i)=='X') num+= (num>=50)? (-10):10;
            if(s.charAt(i)=='L') num+=50;
            if(s.charAt(i)=='C') num+= (num>=500)? (-100):100;
            if(s.charAt(i)=='D') num+=500;
            if(s.charAt(i)=='M') num+=1000;
        }
        return num;
    }
}