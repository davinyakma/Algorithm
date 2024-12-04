class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분모를 통일하기 위해 공통 분모 계산
        int commonDenom = denom1 * denom2;
        int newNumer = numer1 * denom2 + numer2 * denom1;

        // 최대공약수로 기약 분수 만들기
        int gcd = gcd(newNumer, commonDenom);
        int[] answer = {newNumer / gcd, commonDenom / gcd};
        
        return answer;
    }
    
    // 최대공약수(GCD) 계산 함수 (유클리드 호제법)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
// class Solution {
//     public int[] solution(int numer1, int denom1, int numer2, int denom2) {
//         int[] answer = {0, 0};
//         if( denom2 % denom1 == 0){
//             answer[1] = denom2;
//             answer[0] = numer1 * (denom2 / denom1) + numer2;
//         } else if (denom1 % denom2 == 0) {
//             answer[1] = denom1;
//             answer[0] = numer2 * (denom1 / denom2) + numer1;
//         } else {
//             answer[1] = denom1 * denom2;
//             answer[0] = numer1 * denom2 + numer2 * denom1;
//         }
//         return answer;
//     }
// }