class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights: number[]): number {
        let barHeight = 0;
        let left = 0;
        let right = heights.length-1;

        while(left < right){
            let area = Math.min(heights[left] , heights[right]) * (right - left);
            barHeight = Math.max(barHeight, area);

            if(heights[left] <= heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return barHeight;
    }
}
