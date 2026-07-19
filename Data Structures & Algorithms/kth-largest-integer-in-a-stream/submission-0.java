class KthLargest {

    List<Integer> list = new ArrayList<>();
    int largest ;
    public KthLargest(int k, int[] nums) {
       for (int num : nums) {
          list.add(num);
        }
        largest = k;
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        int n = list.size()-largest;

        return list.get(list.size()-largest);
        

        
    }
}
