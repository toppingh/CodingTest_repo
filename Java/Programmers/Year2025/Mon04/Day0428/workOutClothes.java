package Java.Programmers.Year2025.Mon04.Day0428;

// Title : 체육복
// Q. 체격 순으로 학생들의 번호가 매겨져있고, 바로 앞 또는 뒷번호의 학생에게만 체육복을 빌려줄 수 있다. 최대한 많은 학생이 체육 수업을 들어야 한다.
// Q. 전체 학생 수 n, 체육복을 도난당한 학생 번호가 담긴 배열 lost, 여벌 체육복을 가져온 학생의 번호가 담긴 배열 reserve가 매개변수로 주어진다.
// Q. 체육수업을 들을 수 있는 학생의 최댓값을 return 하는 solution 함수

import java.util.Arrays;

class Solution1 {
    int solution (int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

         // 여벌 체육복 o 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 앞, 뒷번호에게 대여
        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (k - 1 == reserve[j] || k + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}

public class workOutClothes {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(5, new int[] {2, 4}, new int[] {1, 3, 5}));
        System.out.println(s1.solution(5, new int[] {2, 4}, new int[] {3}));
        System.out.println(s1.solution(3, new int[] {3}, new int[] {1}));
    }
}
