class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(list.size() < k){
                list.add(arr[i]);
            }
            else{
                if(Math.abs(arr[i] - x) < Math.abs(list.get(0) - x)){
                    list.remove(0);
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}


