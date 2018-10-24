# 71.Simplify_Path
Given an absolute path for a file (Unix-style), simplify it. 

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
path = "/a/../../b/../c//.//", => "/c"
path = "/a//b////c/d//././/..", => "/a/b/c"

In a UNIX-style file system, a period ('.') refers to the current directory, so it can be ignored in a simplified path. Additionally, a double period ("..") moves up a directory, so it cancels out whatever the last directory was. For more information, look here: https://en.wikipedia.org/wiki/Path_(computing)#Unix_style

# Corner Cases:

Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
# My Solution
```
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
```
