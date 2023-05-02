package programmers;

/*
출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java

-- 문제 풀이 전 생각해보기 --
1. 여는 괄호의 개수를 count한다.
2. 닫는 괄호의 개수를 count한다.
2-1. 닫는 괄호의 개수가 여는 괄호의 보다 많으면 false를 return한다.
3. for문이 끝난 후 괄호 개수를 check하여 불일치가 없다면 true를 return한다.
 */
public class Solution12909 {
    public boolean solution(String s) {
        int openBracket = 0;
        int closeBracket = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') {
                openBracket++;
                continue;
            } // if

            if (s.charAt(index) == ')') {
                closeBracket++;

                if (openBracket < closeBracket) {
                    return false;
                } // if
            } // if
        } // for

        return openBracket == closeBracket;
    } // solution
} // end class
