# 253.Meeting_Rooms_II
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

# Example :
```
Input: [[0, 30],[5, 10],[15, 20]]
Output: 2

Input: [[7,10],[2,4]]
Output: 1

```



# My Solution :
```
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals==null || intervals.length==0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){return a.start-b.start;}
        });
        PriorityQueue<Interval> heap = new PriorityQueue<>(intervals.length, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){return a.end-b.end;}
        });
        heap.offer(intervals[0]);
        for(int i = 1; i<intervals.length; i++){
            Interval inter = heap.poll();
            if(intervals[i].start>=inter.end){
                inter.end = intervals[i].end;
            }
            else{
                heap.offer(intervals[i]);
            }
            heap.offer(inter);
        }
        return heap.size();
    }
}

```
