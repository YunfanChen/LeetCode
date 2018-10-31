# 760.Find_Anagram_Mappings
Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.

We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.

These lists A and B may contain duplicates. If there are multiple answers, output any of them.
 
# Example :
```
A = [12, 28, 46, 32, 50]
B = [50, 12, 32, 46, 28]
We should return [1, 4, 3, 2, 0]

```

# My Solution :
```
import java.util.Hashtable;
class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        int[] res = new int[A.length];
        for(int i = 0; i<B.length; i++){
            h.put(B[i],i);
        }
        for(int i = 0; i<A.length; i++){
            res[i] = h.get(A[i]);
        }
        return res;
    }
}
```
