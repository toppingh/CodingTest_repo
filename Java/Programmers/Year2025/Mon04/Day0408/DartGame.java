package Java.Programmers.Year2025.Mon04.Day0408;

// Title : [1차] 다트 게임
// Q. 다트 점수 계산은 아래와 같다.
// Q. 다트 게임은 총 3번의 기회로 구성되며 각 기회마다 0 ~ 10점까지 얻을 수 있다.
// Q. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 1제곱, 2제곱, 3제곱으로 계산된다.
// Q. 옵션으로 스타(*), 아차(#)상이 존재하며 스타는 해당 점수와 바로 전에 얻은 점수를 각 2배로, 아차상은 해당점수는 마이너스 된다.
// Q. 스타상은 첫 번째 기회에서 나올 수 있고 이 경우 첫번째 스타상의 점수만 2배가 된다.
// Q. 스타상의 효과는 다른 스타상의 효과와 중첩될 수 있고 중첩된 스타상 점수는 4배가 된다.
// Q. 스타상의 효과는 아차상의 효과와 중첩될 수 있고 중첩된 아차상의 점수는 -2배가 된다.
// Q. Single, Double, Triple은 점수마다 하나씩 존재한다.
// Q. 스타상, 아차상은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
// Q. 0 ~ 10 정수와 문자 S, D, T, *, # 으로 구성되 문자열 입력 시 총점수를 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int solution (String dartResult) {
        int[] scores = new int[3];
        int idx = 0;
        int i = 0;

        while (i < dartResult.length()) {
            // 1. 점수 계산
            int score;
            if (dartResult.charAt(i) == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                score = 10;
                i += 2;
            } else {
                score = dartResult.charAt(i++) - '0';
            }

            // 2. 보너스 계산
            char bonus = dartResult.charAt(i++);
            switch (bonus) {
                case 'D': score = score * score; break;
                case 'T': score = score * score * score; break;
            }

            // 3. 옵션 계산
            if (i < dartResult.length()) {
                if (dartResult.charAt(i) == '*') {
                    score *= 2;
                    if (idx > 0) scores[idx - 1] *= 2;
                    i++;
                } else if (dartResult.charAt(i) == '#') {
                    score *= -1;
                    i++;
                }
            }

            // 4. 저장
            scores[idx++] = score;
        }

        return scores[0] + scores[1] + scores[2];
    }
}

public class DartGame {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("1S2D*3T"));
        System.out.println(s1.solution("1D2S#10S"));
        System.out.println(s1.solution("1D2S0T"));
        System.out.println(s1.solution("1S*2T*3S"));
        System.out.println(s1.solution("1S#2T*3S"));
        System.out.println(s1.solution("1T2D3D#"));
        System.out.println(s1.solution("1D2S3T*"));
    }
}
