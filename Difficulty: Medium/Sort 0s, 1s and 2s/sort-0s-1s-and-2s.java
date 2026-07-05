class Solution {
    public void sort012(int[] arr) {
        // code here
        int left = 0, i =0, right = arr.length - 1;
        
        while(i <= right){
            if(arr[i] == 0){
                arr[i] = arr[left];
                arr[left] = 0;
                left++;
                i++;
            }
            else if(arr[i] == 1) i++;
            else{
                arr[i] = arr[right];
                arr[right] = 2;
                right--;
            }
        }
    }
}