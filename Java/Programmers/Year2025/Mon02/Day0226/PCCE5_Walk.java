package Java.Programmers.Year2025.Mon02.Day0226;

// Title : [PCCE 기출문제] 5번 / 산책
// Q. 산책루트가 담긴 문자열 route가 주어질 때, 도착점의 위치를 return 하는 solution 함수
// Q. route에서 N은 북쪽으로 1만큼 S는 남쪽으로 1만큼(=북쪽으로 -1), E는 동쪽으로 1만큼, W는 서쪽으로 1만큼(=동쪽으로 -1) 움직인다.
// Q. 출발점으로부터 [동쪽으로 떨어진 거리, 북쪽으로 떨어진 거리] 형태로 최종 위치 return

import java.util.Arrays;

class Solution1 {
    int[] solution (String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];

        for (int i = 0; i < route.length(); i++) {
            switch(route.charAt(i)) {
                case 'N' :
                    north++;
                    break;
                case 'S' :
                    north--;
                    break;
                case 'E' :
                    east++;
                    break;
                case 'W' :
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}

public class PCCE5_Walk {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(s1.solution("NSSNEWWN")));
        System.out.println(Arrays.toString(s1.solution("EESEEWNWSNWWNS")));
    }
}
