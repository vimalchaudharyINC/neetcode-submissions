class Solution {
    public void sortColors(int[] nums) {
        int sorted[] = Arrays.stream(nums)
                              .sorted()
                              .toArray();
        System.arraycopy(sorted,0,nums,0,nums.length);
    }
}