# 728.Self_Dividing_Numbers
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.


# Example 1 :
```
Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

```

# My Solution :
```
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new LinkedList();
        for(int i = left; i<=right; i++){
            if(isSelfDivid(i)) res.add(i);
        }
        return res;
    }
    public boolean isSelfDivid(int num){
        String s = String.valueOf(num);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)-'0'==0) return false;
            else if(num % (s.charAt(i)-'0')==0) continue;
            return false;
        }
        return true;
    }
}

```
