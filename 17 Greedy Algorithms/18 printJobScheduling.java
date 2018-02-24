package Greedy;
import java.util.*;
//Given an array of jobs where every job has a deadline
// and associated profit if the job is finished before the deadline.
// It is also given that every job takes single unit of time,
// so the minimum possible deadline for any job is 1.
// How to maximize total profit if only one job can be scheduled at a time.
public class JobSequencing {
    public static int maxprofit = 0;
    public static class Job{
        char name;
        int deadline;
        int profit;
        public Job(char name, int deadline, int profit){
            this.name = name;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static class Result{
        char name;
        int deadline;
        public Result(char name, int deadline){
            this.name = name;
            this.deadline = deadline;
        }
    }

    public static List<Result> printJobScheduling(Job[] jobs){
        //Sort all the jobs in decreasing order of profit
        List<Result> list = new ArrayList<>();
        Arrays.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit-o1.profit;
            }
        });
        //Get the max profit one
        list.add(new Result(jobs[0].name,jobs[0].deadline));
        Set<Integer> set = new HashSet<>();
        set.add(jobs[0].deadline);
        maxprofit+=jobs[0].profit;
        for(int i=1;i<jobs.length;i++){
            if(set.add(jobs[i].deadline)) {
                list.add(new Result(jobs[i].name, jobs[i].deadline));
                maxprofit+=jobs[i].profit;
            }
        }
        Collections.sort(list, new Comparator<Result>() {
            @Override
            public int compare(Result o1, Result o2) {
                return o1.deadline-o2.deadline;
            }
        });
        return list;
    }

    public static void display(List<Result> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i).name+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Job[] jobs = { new Job('a', 2, 100),
                new Job('b', 1, 19),
                new Job('c', 2, 27),
                new Job('d', 1, 25),
        new Job('e',3,15)};
        System.out.println("The maximum profit sequence ");
        List<Result> list = printJobScheduling(jobs);
        display(list);
        System.out.println("and the max profit is "+maxprofit);
    }
}
