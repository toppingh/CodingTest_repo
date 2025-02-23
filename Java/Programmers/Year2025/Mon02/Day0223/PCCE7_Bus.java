package Java.Programmers.Year2025.Mon02.Day0223;

// Title : [PCCE 기출문제] 7번 / 버스
// Q. 버스 좌석 개수 seat, 버스가 순서대로 방문한 정거장에서 승객이 승/하차한 정보를 담은 2차원 문자열 리스트 passengers가 주어진다.
// Q. 이때, 버스에 남아있는 좌석의 개수를 return 하는 함수

class Solution2 {
    int solution (int seat, String[][] passengers) {
        int num_passenger = 0;
        for (int i = 0; i < passengers.length; i++) {
            num_passenger += func4(passengers[i]);
            num_passenger -= func3(passengers[i]);
        }
        int answer = func1(seat - num_passenger);
        return answer;
    }

    int func1 (int num) {
        if (0 > num) {
            return 0;
        } else {
            return num;
        }
    }

    int func2 (int num) {
        if (num > 0) {
            return 0;
        } else {
            return num;
        }
    }

    int func3 (String[] station) {
        int num = 0;
        for (int i = 0; i < station.length; i++) {
            if (station[i].equals("Off")) {
                num += 1;
            }
        }
        return num;
    }

    int func4 (String[] station) {
        int num = 0;
        for (int i = 0; i < station.length; i++) {
            if (station[i].equals("On")) {
                num += 1;
            }
        }
        return num;
    }
}

public class PCCE7_Bus {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(5, new String[][] {{"On", "On", "On"}, {"Off", "On", "-"}, {"Off", "-", "-"}}));
        System.out.println(s2.solution(10, new String[][] {{"On", "On", "On", "On", "On", "On", "On", "-", "-"}, {"On", "On", "Off", "Off", "Off", "On", "-", "-", "-"}, {"On", "On", "On", "Off", "On", "On", "On", "Off", "Off", "Off"}, {"On", "On", "Off", "-", "-", "-", "-", "-", "-", "-"}}));
    }
}
