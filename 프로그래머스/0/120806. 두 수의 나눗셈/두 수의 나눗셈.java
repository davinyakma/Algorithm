class Solution {
    public int solution(int num1, int num2) {
        //(num1 / num2)는 기본적으로 정수 나눗셈을 수행하기 때문에, 
        //이를 방지하기 위해 (double) num1 또는 (double) num2으로 하나의 
        //피연산자를 실수로 변환해야 한다. 그 후 int로 형변환하여 정수부분만 추출
        int answer = (int)((double) num1 / num2 * 1000);
        return answer;
    }
}