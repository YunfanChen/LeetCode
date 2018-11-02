# 621.Task_Scheduler
Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks.Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.

However, there is a non-negative cooling interval n that means between two same tasks, there must be at least n intervals that CPU are doing different tasks or just be idle.

You need to return the least number of intervals the CPU will take to finish all the given tasks.

# Example :
```
Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.

```



# My Solution :
```
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for(char task : tasks){
            c[task-'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        while(i>=0 && c[i]==c[25]) i--;
        
        return Math.max(tasks.length, (c[25]-1)*(n+1)+25-i);
    }
}

```
