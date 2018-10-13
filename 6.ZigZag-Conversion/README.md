# 6.ZigZag-Conversion
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
```
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: "PAHNAPLSIIGYIR"  
Write the code that will take a string and make this conversion given a number of rows:
```
string convert(string text, int nRows);
```
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
## My Solution
```
class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        int i = 0, index = 0;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(i = 0;i < sb.length; i++) sb[i] = new StringBuffer();
        i = 0;
        while(i<len){
            for(index = 0;index<numRows && i<len;index++){
                sb[index].append(c[i++]); 
            } 
            for(index=numRows-2;index>=1 && i<len;index--){
                sb[index].append(c[i++]);
            }
        }
        for(index=1;index<numRows;index++) sb[0].append(sb[index]);
        return sb[0].toString();
    }
}
```
## What I Got
- string.toCharArray(); //convert a string to a char array
- Use StringBuffer is the key point in this question.
- After first for loop, the index number should minus 2, since it equals numRows+1 when it go out from first loop.
- StringBuffer.append() and StringBuffer.toString();
- Reviewed StringBuffer. 
