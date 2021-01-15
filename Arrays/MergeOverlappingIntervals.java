import java.util.*;

 // Definition for an interval.
  class Interval1 {
      int start;
     int end;
     Interval1() { start = 0; end = 0; }
      Interval1(int s, int e) { start = s; end = e; }
  }
public class MergeOverlappingIntervals {
    public ArrayList<Interval1> merge(ArrayList<Interval1> intervals) {
        if(intervals==null)
        return null;
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        ArrayList<Interval1>merged=new ArrayList<>();
        for(Interval1 current:intervals){
            if(merged.isEmpty()||merged.get(merged.size()-1).end<current.start){
                merged.add(current);
            }else{
                merged.get(merged.size()-1).end=Math.max(current.end,merged.get(merged.size()-1).end);
            }
        }
return merged;
    }
}
