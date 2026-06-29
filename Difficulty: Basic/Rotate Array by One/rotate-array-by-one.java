class Solution {
    public void rotate(int[] arr) {
        // code here
        rev(arr, 0, arr.length-2);
        rev(arr, 0, arr.length-1);
    }
    
    private void rev(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}