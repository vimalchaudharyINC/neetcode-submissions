class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() <= 2){
            return true;
        }
        boolean isPalindrome = true;
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                isPalindrome = true;
            }
            left++;
            right--;
        }
        if(s.charAt(left) != s.charAt(right)){
         left++;   
         isPalindrome = false;
        }
        else if(s.charAt(left) != s.charAt(right)){
            right--;
            isPalindrome = false;
        }
        else{
            isPalindrome = true;
        }
        return isPalindrome ? true: false;
    }
}

