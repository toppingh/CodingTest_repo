package me.topping.Programmers.AIReport;

public class NumGroup {
    public String solution(String X, String Y) {

        // 두 숫자에서 각 숫자 빈도를 위한 배열 초기화
        int[] cntX = new int[10]; // 0 ~ 9까지 총 10개로 초기화
        int[] cntY = new int[10];

        // x에서 각 숫자의 빈도 저장
        for (char ch : X.toCharArray()) {
            cntX[ch - '0']++;
        }

        // y에서 각 숫자의 빈도 저장
        for (char ch : Y.toCharArray()) {
            cntY[ch - '0']++;
        }
        // 공통된 숫자를 내림차순으로 추가해서 가장 큰 숫자 생성
        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(cntX[i], cntY[i]);
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }

        // 결과 조건
        if (answer.length() == 0) {
            return "-1";
        }

        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}
