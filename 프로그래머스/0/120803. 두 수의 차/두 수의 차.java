class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1 >= num2){
            answer = num1 - num2;
        } 
        else answer = -(num2 - num1);
        
        return answer;
    }
}