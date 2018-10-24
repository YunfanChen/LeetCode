class Solution {
    public int magicalString(int n) {
        StringBuilder magic = new StringBuilder("122");
        for(int i = 2; i<n; i++){
            if(magic.charAt(i)=='1'){
                if(magic.charAt(magic.length()-1)=='1'){
                    magic.append("2");
                }else{
                    magic.append("1");
                }
                
            }
            if(magic.charAt(i)=='2'){
                if(magic.charAt(magic.length()-1)=='1'){
                    magic.append("22");
                }else{
                    magic.append("11");
                }
            }
        }
        int result = 0;
        String s = magic+"";
        for(int i = 0 ; i<n; i++){
            if(s.charAt(i)=='1') result++;
            else ;
        }
        return result;
    }
}