package Java.Programmers.Year2025.Mon05.Day0515;

// Title : 성격 유형 검사하기
// Q. 총 4가지의 성격 유형 지표가 있으므로 성격 유형은 총 16(2 x 2 x 2 x 2)가지가 나올 수 있다.
// 1번 지표 - 라이언형(R), 튜브형(T)    2번 지표 - 콘형(C), 프로도형(F)    3번 지표 - 제이지형(J), 무지형(M)     4번 - 어피치형(A), 네오형(N)
// 검사지에는 총 n개의 질문이 있고, 각 질문에는 7개의 선택지가 있다.(매우 비동의-3, 비동의-2, 약간 비동의-1, 모르겠음, 약간 동의-1, 동의-2, 매우 동의-3)
// 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단한다.
// 질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey와 검사자가 각 질문마다 선택한 선택지를 담은 1차원 정수 배열 choices가 매개변수로 주어진다.
// 이 때, 검사자의 성격 유형 검사 결과를 지표 번호 순서대로 return 하는 solution 함수

class Solution1 {
    String solution (String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int[] scores = new int[8];

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) {
                scores[getIdx(survey[i].charAt(0))] += Math.abs(choices[i] - 4);
            } else {
                scores[getIdx(survey[i].charAt(1))] += Math.abs(choices[i] - 4);
            }
        }

        sb.append(scores[0] >= scores[1] ? 'R' : 'T');
        sb.append(scores[2] >= scores[3] ? 'C' : 'F');
        sb.append(scores[4] >= scores[5] ? 'J' : 'M');
        sb.append(scores[6] >= scores[7] ? 'A' : 'N');

        return sb.toString();
    }

    private int getIdx(char type) {
        return switch (type) {
            case 'R' -> 0;
            case 'T' -> 1;
            case 'C' -> 2;
            case 'F' -> 3;
            case 'J' -> 4;
            case 'M' -> 5;
            case 'A' -> 6;
            case 'N' -> 7;
            default -> -1;
        };
    }
}

public class CharacteristicsTest {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
        System.out.println(s1.solution(new String[] {"TR", "RT", "TR"}, new int[] {7, 1, 3}));
    }
}
