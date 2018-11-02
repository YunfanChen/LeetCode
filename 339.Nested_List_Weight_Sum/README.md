# 339.Nested_List_Weight_Sum
Given a nested list of integers, return the sum of all integers in the list weighted by their depth.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.



# Example 1 :
```
Input: [[1,1],2,[1,1]]
Output: 10 
Explanation: Four 1's at depth 2, one 2 at depth 1.

```
# Example 2 :
```
Input: [1,[4,[6]]]
Output: 27 
Explanation: One 1 at depth 1, one 4 at depth 2, and one 6 at depth 3; 1 + 4*2 + 6*3 = 27.

```


# My Solution :
```
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
    private int sum;
    public int depthSum(List<NestedInteger> nestedList) {
        if(nestedList==null) return 0;
        sum = 0;
        for(NestedInteger ns : nestedList){
            sumHelper(ns,1);
        }
        return sum;
    }
    public void sumHelper(NestedInteger ns, int depth){
        if(ns.getInteger()!=null){
            sum += ns.getInteger()*depth;
            return ;
        }
        for(NestedInteger nes : ns.getList()){
            sumHelper(nes,depth+1);
        }
    }
}

```
# My Solution 2 :
```
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

```
