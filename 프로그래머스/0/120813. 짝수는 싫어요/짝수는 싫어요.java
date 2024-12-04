import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        // 1. n 이하의 홀수를 찾기 위해 배열 크기 계산
        int size = (n + 1) / 2;  // 홀수는 n/2개 이므로 크기를 (n + 1) / 2로 설정

        // 2. 배열 선언 및 홀수 저장
        int[] answer = new int[size];
        int index = 0;
        
        for (int i = 1; i <= n; i += 2) {  // 홀수만 찾기 위해 1부터 시작하여 2씩 증가
            answer[index++] = i;
        }
        return answer;
    }
}