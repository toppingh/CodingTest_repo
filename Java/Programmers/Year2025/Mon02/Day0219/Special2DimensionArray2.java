package Java.Programmers.Year2025.Mon02.Day0219;

// Title : 특별한 이차원 배열2
// Q. n x n 크기의 이차원 배열 arr이 매개변수로 주어질 때, arr이 아래를 만족하면 1, 아니면 0을 return 하는 solution 함수
// Q. 0 <= i, i <n인 정수 i, j에 대해 arr[i][j] = arr[j][i]

class Solution2 {
    int solution (int[][] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

public class Special2DimensionArray2 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[][] {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}));
        System.out.println(s2.solution(new int[][] {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}));
    }
}
