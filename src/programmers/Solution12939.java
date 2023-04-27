package programmers;

import java.util.Arrays;


/*
출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java

-- 문제 풀이 전 생각해보기 --
매개변수 s에는 둘 이상의 정수가 공백으로 구분되어 있으므로
String.split(" ") 메소드를 사용하여 구분자 기준으로 배열을 생성한다.
문자열 요소를 정숫값으로 변환 후 최솟값과 최댓값을 구한다.
 */

public class Solution12939 {
    public String solution(String s) {
        String[] stringSplit = s.split(" ");
        int min = Arrays.stream(stringSplit).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Arrays.stream(stringSplit).mapToInt(Integer::parseInt).max().getAsInt();

        return min + " " + max;
    } // solution
} // end class


