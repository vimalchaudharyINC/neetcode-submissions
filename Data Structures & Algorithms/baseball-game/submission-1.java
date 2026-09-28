class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String num : operations){
            switch(num){
                case "C" :
                stack.pop();
                break;

                case "D" :
                stack.push(stack.peek() * 2);
                break;

                case "+":
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last);
                stack.push(last + secondLast);
                break;

                default:
                stack.push(Integer.parseInt(num));
                break;
            }
        }
        int sum = 0;
        for(int score : stack){
            sum += score;
        }
        return sum;
    }
}