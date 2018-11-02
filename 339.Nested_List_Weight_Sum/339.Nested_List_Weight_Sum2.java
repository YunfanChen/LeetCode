/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        if(nestedList==null) return 0;
        int res = 0;
        Queue<NestedInteger> q = new LinkedList<>();
        for(NestedInteger ns : nestedList){
            q.offer(ns);
        }
        int depth = 0;
        while(!q.isEmpty()){
            int size = q.size();
            depth++;
            for(int i = 0; i<size; i++){
                NestedInteger ns = q.poll();
                if(ns.isInteger()){
                    res += ns.getInteger()*depth;
                }
                else{
                    List<NestedInteger> nesList = ns.getList();
                    for(NestedInteger nesInt : nesList){
                        q.offer(nesInt);
                    }
                }
            }
        }
        return res;
    }
}

