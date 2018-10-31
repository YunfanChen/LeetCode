class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> h = new HashSet<>();
        for(int i = 0; i<words.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<words[i].length(); j++){
                sb.append(morse[words[i].charAt(j)-'a']);
            }
            h.add(sb.toString());
        }
        return h.size();
    }
}