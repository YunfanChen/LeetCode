class Solution {
    public int reverse(int x) {
        int res=0;
        long num = 0;
        if(x==0) return 0;
        while(x!=0){
            res = x % 10;
            num=10*num;
            num+=res;
            if(num>Integer.MAX_VALUE||num<Integer.MIN_VALUE) return 0;
            x=x/10;
        }
        return (int)num;
    }
}