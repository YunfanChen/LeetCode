class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            sb.append(Character.toLowerCase(str.charAt(i)));
        }
        return sb.toString();
    }
}