package Greedy;
import java.util.*;
//Given a List of intervals, find the maximum number of intervals
//that can be allocated a common resource, such that no two intervals overlap
//with each other
//One Limitation is that the start time of an interval is always less than end time
public class IntervalScheduling {

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

    //O(nlogn) time and O(1) space
    public int minint(List<Interval> list){
        //Sanity check
        if(list==null || list.size()==0) return 0;
        //Sort the list in increasing order of their end points
        //If their end points are equal, then sort in increasing order of their start points
        Collections.sort(list, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.end!=o2.end)
                    return o1.end-o2.end;
                else
                    return o1.start-o2.start;
            }
        });
        int count = 1;
        int end = list.get(0).end;
        for(int i=1;i<list.size();i++){
            int curstart = list.get(i).start;
            int curend = list.get(i).end;
            //Curstart must be greater than or equal to end to accomodate this new interval
            if(curstart>=end){
                count++;
                end = curend;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        IntervalScheduling i = new IntervalScheduling();
        List<Interval> list = new ArrayList<>();
        Interval i1 = new Interval(10,20);
        Interval i2 = new Interval(12,25);
        Interval i3 = new Interval(20,30);
        list.add(i1);list.add(i2);list.add(i3);
        System.out.println("The max no of intervals that can be scheduled are "+i.minint(list));
    }
}
