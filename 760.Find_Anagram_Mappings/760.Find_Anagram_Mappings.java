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