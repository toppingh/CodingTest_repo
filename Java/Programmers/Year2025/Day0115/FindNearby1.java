package Java.Programmers.Year2025.Day0115;

// Title : 가까운 1 찾기
// Q. 정수 배열 arr의 원소는 1 또는 0이고 정수 idx가 주어졌을 때, idx보다 크면서 배열 값이 1인 가장 작은 인덱스를 찾아 반환하는 solution 함수
// Q. 그러한 인덱스가 없을 경우 -1 반환

class Solution5 {
    int solution (int[] arr, int idx) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}

public class FindNearby1 {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(new int[] {0, 0, 0, 1}, 1));
        System.out.println(s5.solution(new int[] {1, 0, 0, 1, 0, 0}, 4));
        System.out.println(s5.solution(new int[] {1, 1, 1, 1, 0}, 3));
    }
}
