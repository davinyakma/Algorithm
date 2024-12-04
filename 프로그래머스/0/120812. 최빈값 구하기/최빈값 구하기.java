class Solution {
    public int solution(int[] array) {
        // 1. 배열에서 가장 큰 숫자 찾기
        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num; // max는 가장 큰 숫자
            }
        }

        // 2. 각 숫자가 몇 번 나왔는지 세는 배열 만들기
        int[] count = new int[max + 1]; // 최대 숫자까지 세는 배열
        for (int num : array) {
            count[num]++; // 숫자에 해당하는 자리에 +1씩 증가
        }

        // 3. 가장 많이 나온 숫자 찾기
        int mode = -1;  // 최빈값을 저장할 변수 (처음에는 -1로 설정)
        int maxCount = 0; // 최빈값의 빈도수
        boolean isUnique = true; // 최빈값이 유일한지 확인하는 변수

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i]; // 빈도가 더 크면 갱신
                mode = i; // 최빈값도 갱신
                isUnique = true; // 유일한 최빈값으로 설정
            } else if (count[i] == maxCount) {
                isUnique = false; // 빈도가 같은 숫자가 있으면 유일하지 않다고 설정
            }
        }

        // 최빈값이 유일하면 mode, 아니면 -1을 반환
        return isUnique ? mode : -1;
    }
}