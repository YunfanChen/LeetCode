class Solution {
    public List<String> letterCombinations(String digits) {
        String[] s = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList();
        for(int num = digits.length(); --num>=0;){
            if(!Character.isDigit(digits.charAt(num))) return result;
            else ;
        }
        for(int i = 0; i<digits.length(); i++){
            result = mix(result,s[(digits.charAt(i))-'0']);
        }
        return result;
    }
    public List<String> mix(List<String> l, String s){
        List<String> mixL = new ArrayList();
        if(l.size()==0){
            for(int j = 0; j<s.length(); j++){
                mixL.add(""+s.charAt(j));
            }
        }
        for(int i =0; i<l.size(); i++){
            for(int j = 0; j<s.length(); j++){
                mixL.add(l.get(i)+s.charAt(j));
            }
        }
        return mixL;
    }
    
}