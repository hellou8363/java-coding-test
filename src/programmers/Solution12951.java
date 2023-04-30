package programmers;

/*
출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12951

-- 문제 풀이 전 생각해보기 --
문자열 맨 처음 문자는 무조건 대문자로 변환하고
공백문자는 연속해서 나올 수 있으므로
상태를 체크하는 변수를 만들어 공백 뒤 첫 번째 문자를 대문자로 변환하고
다른 문자들은 소문자로 변환한다.
 */

public class Solution12951 {
    public String solution(String s) {
        boolean isPreviousWhiteSpace = false;
        StringBuilder result = new StringBuilder();

        result.append(String.valueOf(s.charAt(0)).toUpperCase());

        for (int index = 1; index < s.length(); index++) {
            if (s.charAt(index) == ' ') {
                isPreviousWhiteSpace = true;
            } else if (isPreviousWhiteSpace) {
                result.append(String.valueOf(s.charAt(index)).toUpperCase());
                isPreviousWhiteSpace = false;
                continue;
            } // if-else-if

            result.append(String.valueOf(s.charAt(index)).toLowerCase());
        } // for

        return result.toString();
    } // solution
} // end class
