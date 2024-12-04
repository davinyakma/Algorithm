class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 수동 정렬 (Bubble Sort)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // 중앙값 계산
        answer = array[array.length / 2];
        
        return answer;
    }
}

//import java.util.Arrays;

// class Solution {
//     public int solution(int[] array) {
//         int answer = 0;
        
//         // 배열 정렬
//         Arrays.sort(array);
        
//         // 중앙값 계산 (길이의 중간 인덱스)
//         answer = array[array.length / 2];
        
//         return answer;
//     }
// }