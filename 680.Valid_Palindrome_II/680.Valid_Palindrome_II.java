class Solution {
    public boolean validPalindrome(String s) {
        int head = -1, tail = s.length();
        while(++head<--tail){
            if(s.charAt(head)!=s.charAt(tail)){
                return isPalindrome(s,head+1,tail) || isPalindrome(s,head,tail-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int head, int tail){
        while(head<tail){
            if(s.charAt(head)==s.charAt(tail)){
                head++; tail--;
            }
            else return false;
        }
        return true;
    }
}