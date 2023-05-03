package programmers;

/*
출처 : https://school.programmers.co.kr/learn/courses/30/lessons/70129?language=java

-- 문제 풀이 전 생각해보기 --

1. 문자열에서 제거할 모든 0을 개수를 센다.
2. 문자열의 0을 모두 제거한다.
3. 제거한 문자열의 길이을 2진법으로 변환한다.
3. 위 1 ~ 3을 문자열이 "1"이 될때까지 반복하면서
   이진 변환 횟수, 제거된 모든 0의 개수를 반환한다.
 */
public class Solution70129 {
    public int[] solution(String s) {
        int removeZeroCount = 0; // 제거된 모든 0의 개수
        int conversionCount = 0; // 이진 변환의 횟수

        while (!s.equals("1")) { // s가 "1"이라면 반복문 종료

            // 1. 문자열의 0의 개수 체크
            for (int index = 0; index < s.length(); index++) {
                if (s.charAt(index) == '0') {
                    removeZeroCount++; // 제거할 0의 개수 증가
                } // if
            } // for

            // 2. 문자열의 모든 0 제거
            s = s.replaceAll("0", "");

            // 3. 제거한 문자열의 길이를 2진법으로 변환
            s = Integer.toBinaryString(s.length());

            conversionCount++; // 변환 횟수 증가
        } // while

        return new int[]{conversionCount, removeZeroCount};
    } // solution
} // end class
