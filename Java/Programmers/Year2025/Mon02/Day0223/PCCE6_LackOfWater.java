package Java.Programmers.Year2025.Mon02.Day0223;

// Title : [PCCE 기출문제] 6번 / 물 부족
// Q. 지난 달 물 사용량과 이번달부터 일정 기간동안 월별 물 사용량 변화를 예측한 값을 이용해 몇 달 뒤 물이 부족해지는지 예측
// Q. 현재 저수지에 저장된 물의 양을 나타내는 정수 storage와 지난 달 물 사용량을 나타내는 정수 usage
// Q. 월별 물 사용량이 전달 대비 어떻게 변하는지 저장된 정수 change 리스트가 주어진다.
// Q. 몇 달 뒤 물이 부족해지는지 return, 저수지에 물이 남아있다면 -1을 return 하는 solution 함수

class Solution1 {
    int solution (int storage, int usage, int[] change) {
        int total_usage = 0;
        int sum = 0;

        for (int i = 0; i < change.length; i++) {
            usage = usage  + (usage * change[i] / 100);
            total_usage += usage;

            if (total_usage > storage) {
                return i;
            }
        }
        return -1;
    }
}

public class PCCE6_LackOfWater {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(5141, 500, new int[] {10, -10, 10, -10, 10, -10, 10, -10, 10, -10}));
        System.out.println(s1.solution(1000, 2000, new int[] {-10, 25, -33}));
    }
}
