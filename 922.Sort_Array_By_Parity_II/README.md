# 922.Sort_Array_By_Parity_II
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.


# Example 1 :
```
Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

```


# My Solution :
```
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] odd = new int[A.length/2];
        int[] even = new int[A.length/2];
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] % 2 == 0) 
                even[evenCount++] = A[i];
            else odd[oddCount++] = A[i];
        }
        oddCount = 0;
        evenCount = 0;
        for(int i = 0; i<A.length; i+=2){
            A[i] = even[evenCount++];
            A[i+1] = odd[oddCount++];
        }
        return A;
    }
}

```
