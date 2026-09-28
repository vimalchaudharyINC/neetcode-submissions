class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String num : operations){
            if(num.equals("C")){
                stack.pop();
            }
            else if(num.equals("D")){
                int previous = stack.peek();
                stack.push(previous * 2);
            }
            else if(num.equals("+")){
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last);
                stack.push(last + secondLast); 
            }
            else{
                stack.push(Integer.parseInt(num));
            }
        }
        int sum = 0;
        for(int score : stack){
            sum += score;
        }
        return sum;
    }
}

