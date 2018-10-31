class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> res = new HashSet<>();
        for(int i = 0; i<emails.length; i++){
            if(!res.contains(emails[i])){
                res.add(emailHelper(emails[i]));
            }
        }
        return res.size();
    }
    public String emailHelper(String email){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(email.charAt(i)!='@'){
            if(email.charAt(i)=='+'){
                while(email.charAt(i)!='@'){
                    i++;
                }
            }
            else if(email.charAt(i)=='.'){
                    i++;
            }
            else sb.append(email.charAt(i++));      
        }
        sb.append(email.substring(i,email.length()));
        return sb.toString();
    }
}