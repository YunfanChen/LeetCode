class Solution {
    public int numDecodings(String s) {
        if(s.length()==0 || s==null) return 0;
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=s.charAt(0) != '0' ? 1:0; //没有这句A不过
        for(int i = 2; i<=n; i++){
            int one = Integer.valueOf(s.substring(i-1,i));
            int two = Integer.valueOf(s.substring(i-2,i));
            if(one<=9 && one>=1){
                dp[i] += dp[i-1];
            }
            if(two<=26 && two>=10){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}