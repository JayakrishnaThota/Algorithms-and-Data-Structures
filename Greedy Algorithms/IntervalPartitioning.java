package Greedy;
import java.util.*;

//Given a list of intervals, we need to find the min no of classrooms
//allocated such that there won't be any overlap
public class IntervalPartitioning {
    public static class Interval{
        int start;
        int end;
        public Interval(int start, int end){
            this.start = start;
            if(end>=start)
                this.end = end;
            else
                this.end = this.start;
        }
    }

    //O(nlogn) time and O(n) space
    public int minint(List<Interval> list){
        //Sanity check
        if(list==null || list.size()==0) return 0;
        //The max no of resources allocated can be obtained by sorting all the points in time
        //and give +1 to start and -1 to end
        //The max value during this traversal gives us the max no of resources required
        Map<Integer, Integer> map = new HashMap();
        List<Integer> result = new ArrayList<>();
        //Assign '0' for start and '1' for end
        for(Interval i:list){
            map.put(i.start, 0);
            map.put(i.end, 1);
            result.add(i.start);
            result.add(i.end);
        }
        Collections.sort(result);
        int max = 0, count=0;
        for(Integer i:result){
            int m = map.get(i);
            if(m==0) count++;
            else count--;
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        IntervalScheduling i = new IntervalScheduling();
        List<IntervalScheduling.Interval> list = new ArrayList<>();
        IntervalScheduling.Interval i1 = new IntervalScheduling.Interval(900,910);
        IntervalScheduling.Interval i2 = new IntervalScheduling.Interval(940,1200);
        IntervalScheduling.Interval i3 = new IntervalScheduling.Interval(950,1120);
        IntervalScheduling.Interval i4 = new IntervalScheduling.Interval(1100,1130);
        IntervalScheduling.Interval i5 = new IntervalScheduling.Interval(1500,1900);
        IntervalScheduling.Interval i6 = new IntervalScheduling.Interval(1800,2000);
        list.add(i1);list.add(i2);list.add(i3);list.add(i4);list.add(i5);list.add(i6);
        System.out.println("The max no of resources needed are "+i.minint(list));
    }
}
