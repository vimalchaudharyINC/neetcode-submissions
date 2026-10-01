class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> hs = new HashMap<>();
        for(int num : nums){
            hs.put(num,hs.getOrDefault(num, 0) + 1);
        }
       for (Map.Entry<Integer, Integer> entry : hs.entrySet()){ 
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}