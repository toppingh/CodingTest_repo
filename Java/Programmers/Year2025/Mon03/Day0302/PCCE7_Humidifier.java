package Java.Programmers.Year2025.Mon03.Day0302;

// Title : [PCCE 기출문제] 7번 / 가습기
// Q. auto 모드 : 습도가 0이상 10 미만이면 5단계, 습도가 10이상 20미만이면 4단계, 습도가 30이상 40 미만이면 2단계, 40이상 50 미만이면 1단계 습도가 50 이사이면 0단계
// Q. target 모드 : 습도가 설정값 미만이면 3단계, 이상이면 1단계
// Q. minimum 모드 : 습도가 설정값 미만이면 1단계, 이상이면 0단계
// Q. 가습기 모드를 나타내는 문자열 mode_type, 현재 공기 중 습도를 나타내는 정수 humidity, 설정값을 나타낸 정수 val_set이 주어진다.
// Q. 현재 가습기가 몇 단계로 작동 중인지 return 하는 solution 함수

class Solution2 {
    int func1 (int humidity, int val_set) {
        if (humidity < val_set)
            return 3;
        return 1;
    }

    int func2 (int humidity) {
        if (humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
            return 5;
    }

    int func3 (int humidity, int val_set) {
        if (humidity < val_set)
            return 1;
        return 0;
    }

    int solution (String mode_type, int humidity, int val_set) {
        int answer = 0;

        if (mode_type.equals("auto")) {
            answer = func2(humidity);
        }
        else if (mode_type.equals("target")) {
            answer = func1(humidity, val_set);
        }
        else if (mode_type.equals("minimum")) {
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}

public class PCCE7_Humidifier {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("auto", 23, 45));
        System.out.println(s2.solution("target", 41, 40));
        System.out.println(s2.solution("minimum", 10, 34));
    }
}
