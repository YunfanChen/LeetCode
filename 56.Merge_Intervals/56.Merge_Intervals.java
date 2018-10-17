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