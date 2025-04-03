package Java.Programmers.Year2025.Mon04.Day0403;

// Title : [PCCE 기출문제] 9번 / 지폐접기
// Q. 지폐를 접을 때는 항상 길이가 긴 쪽을 반으로 접고 접기 전 길이가 홀수면 접은 후 소수점 이하는 버린다.
// Q. 접힌 지폐를 그대로 또는 90도 돌려서 지갑에 넣을 수 있으면 그만 접는다.
// Q. 지갑의 가로 세로 크기를 담은 정수 리스트 wallet과 지폐의 가로 세로 크기를 담은 정수 리스트 bill이 주어진다.
// Q. 지갑에 넣기 위해 지폐를 최소 몇 번 접어야 하는지 return 하는 solution 함수

// 지폐 접기 과정
// 1. 지폐를 접은 횟수를 저장할 정수 변수 answer를 만들고 0을 저장한다.
// 2. 반복문으로 bill의 작은 값이 wallet의 작은 값보다 크거나 bill의 큰 값이 wallet의 큰 값보다 큰 동안 아래 과정을 반복한다.
// 2-1. bill[0]이 bill[1]보다 크면 bill[0]을 2로 나누고 나머지는 버린다.
// 2-2. 그렇지 않으면 bill[1]을 2로 나누고 나머지는 버린다.
// 2-3. answer를 1 증가시킨다.
// 3. answer를 return 한다.

import java.util.Arrays;

class Solution2 {
    int solution (int[] wallet, int[] bill) {
        int answer = 0;

        while(Math.min(bill[0], bill[1]) > Math.min(wallet[0], wallet[1]) || Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1])) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
        }
        return answer;
    }
}

public class PCCE_9_FoldMoney {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {30, 15}, new int[] {26, 17}));
        System.out.println(s2.solution(new int[] {50, 50}, new int[] {100, 241}));
    }
}
