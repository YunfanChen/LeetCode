class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        Set<String> set = new HashSet<>(Arrays.asList(".","..",""));
        String[] newPath = path.split("/");
        for(String each : newPath){
            if(each.equals("..") && !s.isEmpty()) s.pop();
            else if(!set.contains(each)) s.push(each);
        }
        String result = "";
        while(!s.isEmpty()){
            result = "/" + s.pop() + result;
        }
        return result.isEmpty()? "/":result;
    }
}