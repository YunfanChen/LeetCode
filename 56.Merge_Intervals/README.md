# 56.Merge_Intervals
Given a collection of intervals, merge all overlapping intervals.
# Example 1:
```
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
```
# Example 2:
```
Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
```
# My Solution
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
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1){
            return intervals;
        }
        List<Interval> result = new ArrayList<Interval>();
        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(intervals.size(), (a,b)->(a.start-b.start));
        for(int i = 0; i<intervals.size(); i++){
            pq.offer(intervals.get(i));
        }
        while(pq.size()>1){
            Interval i1=pq.poll();
            Interval i2=pq.poll();
            if(i1.end>=i2.start){
                pq.offer(new Interval(i1.start,Math.max(i1.end,i2.end)));
            }
            else{
                result.add(i1);
                pq.offer(i2);
            }
        }
        result.add(pq.poll());
        return result;
    }
}
```
