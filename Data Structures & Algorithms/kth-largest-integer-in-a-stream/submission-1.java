class KthLargest {

    private PriorityQueue<Integer> priQ = new PriorityQueue<>();
    int K;

    //n
    public KthLargest(int k, int[] nums) {
       K = k;
       for(int n : nums) {
        priQ.offer(n);
        if(priQ.size() > k) {
            priQ.poll();
        }
       }

    }
    
    //tc: nlogn, n steam, 
    public int add(int val) {
        priQ.offer(val);
        if(priQ.size() > K) {
            priQ.poll();
        }
        return priQ.peek();
    }
}
