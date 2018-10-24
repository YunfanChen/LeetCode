class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] num = new int[10];
        for(int i = 0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)) bull++;
            else{
                if(num[secret.charAt(i)-'0'] > 0) cow++;
                if(num[guess.charAt(i)-'0'] < 0) cow++;
                num[secret.charAt(i)-'0']--;
                num[guess.charAt(i)-'0']++;
            }
        }
        return bull + "A" + cow + "B";
    }
}