class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        
        // 배열의 모든 값을 더함
        for(int i : numbers) {
            sum += i;
        }
        
        // 평균을 계산하여 반환
        double answer = sum / numbers.length;
        return answer;
    }
}
