import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr){
            set.add(i);
        }
        
        int max = 0;
        
        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                while(set.contains(i + 1)){
                    count++;
                    i++;
                }
                max = Math.max(max, count);
            }
        }
        
        return max;
    }
}
