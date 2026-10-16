class Solution {
    /**
     * @param {number[]} people
     * @param {number} limit
     * @return {number}
     */
    numRescueBoats(people: number[], limit: number): number {
        people.sort((a,b) => b - a);
        let count = 0;
        let left = 0;
        let right = people.length-1;

        while(left < right){
            if(people[left] + people[right] <= limit){
                left++;
            }
        
            right--;
            count++;
        }
        return count;
    }
}
