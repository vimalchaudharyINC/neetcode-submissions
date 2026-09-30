class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> tree = new TreeSet<>();
        for(int num : nums){
            tree.add(num);
        }
        int i = 0;
        for(int num : tree){
            nums[i++] = num;
        }
        return tree.size();
    }
}