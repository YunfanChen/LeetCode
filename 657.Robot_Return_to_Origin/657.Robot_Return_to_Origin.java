class Solution {
    public boolean judgeCircle(String moves) {
        int ud = 0, lr = 0;
        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i)-'U'==0) ud++;
            else if(moves.charAt(i)-'D'==0) ud--;
            else if(moves.charAt(i)-'L'==0) lr--;
            else if(moves.charAt(i)-'R'==0) lr++;
            else ;
        }
        if(ud==0 && lr==0) return true;
        else return false;
    }
}