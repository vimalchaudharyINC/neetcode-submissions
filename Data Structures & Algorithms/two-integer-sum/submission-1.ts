class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        for(let i : number = 0; i < nums.length-1; i++){
            for(let j : number = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return [i,j];
                }
            }
        }
        return [-1,-1];
    }
}
