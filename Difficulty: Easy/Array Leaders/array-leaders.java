class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        
        int led = arr[arr.length-1];
        
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] >= led){
                list.add(arr[i]);
                led = arr[i];
            }
        }
        
        Collections.reverse(list);
        return list;
    }
}
