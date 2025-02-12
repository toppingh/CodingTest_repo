package Java.Programmers.Year2025.Mon02.Day0212;

// Title : 종이 자르기
// Q. 정수 M, N이 매개변수일 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하는 solution 함수

 class Solution7 {
     int solution (int M, int N) {
         return M * N - 1;
     }
 }

public class CuttingPaper {
    public static void main(String[] args) {
        Solution7 s7 = new Solution7();
        System.out.println(s7.solution(2, 2));
        System.out.println(s7.solution(2, 5));
        System.out.println(s7.solution(1, 1));
    }
 }
