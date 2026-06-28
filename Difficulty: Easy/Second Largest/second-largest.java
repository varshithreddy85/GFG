class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        
        for(int i : arr){
            if(i > max){
                smax = max;
                max = i;
            }
            else if(i < max && smax < i){
                smax = i;
            }
        }
        
        return (smax != Integer.MIN_VALUE) ? smax : -1;
    }
}