package programmers;

/*
출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12924?language=java

-- 문제 풀이 --
1. 자연수 n 자체에 대한 count 1로 표현방법 개수를 세는 변수(methodCount)를 초기화한다.
2. 만약, 자연수 n이 3보다 작다면 표현방법은 하나밖에 없으므로 바로 methodCount를 반환한다.
3. 자연수 n이 3보다 크다면, 자연수 n의 (n/2) + 1인 숫자를 변수(startNumber)에 저장한다.
4. startNumber에서 - 1씩 감소한 숫자를 빼면서 0이 나오는지 확인한다.
5. 뺄셈 중 0이 나오면 연속한 자연수로 표현하는 방법이므로 표현방법을 개수를 세는 변수(methodCount)를 1 증가시킨다.
6. 만약, 음수가 나온다면 startNumber - 1한 숫자로 다시 4번부터 시작한다.
7. startNumber가 2보다 큰 수인 동안 반복한다.
 */
public class Solution12924 {
    public int solution(int n) {
        int methodCount = 1;

        if (n < 3) {
            return methodCount;
        } // if

        for (int startNumber = (n / 2) + 1; startNumber > 0; startNumber--) {
            int resultNumber = n;

            for (int inner = startNumber; inner > 0; inner--) {
                resultNumber -= inner;

                if (resultNumber == 0) {
                    methodCount++;
                    break;
                } // if

                if (resultNumber < 0) {
                    break;
                } // if
            } // inner-for
        } // outer-for

        return methodCount;
    } // solution
} // end class

