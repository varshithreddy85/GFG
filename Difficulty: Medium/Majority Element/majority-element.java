class Solution {
    int majorityElement(int arr[]) {
        // code here
        Map<Integer, Integer> freq = new HashMap<>();
        int min = arr.length / 2;
        
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
            if(freq.get(i) > min) return i;
        } 
        return -1;
    }
}