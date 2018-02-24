class MedianFinder {
    //Default pq in java is a min pq
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min = new PriorityQueue();
        max = new PriorityQueue();
    }
    //O(logn)
    public void addNum(int num) {
        max.offer(-num);
        min.offer(-max.poll());
        if(max.size()<min.size()-1)
            max.offer(-min.poll());
    }
    //O(1)
    public double findMedian() {
        if(min.size()==max.size())
            return ((min.peek()-max.peek())/2.0);
        else 
            return min.peek();
    }
}
