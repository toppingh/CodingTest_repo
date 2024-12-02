package me.topping.Programmers.Day1202;

// Title : 더 크게 합치기
// Q. 양의 정수 a와 b가 주어졌을 때, a + b와 b + a 중 더 큰 값을 return하는 solution 함수
// 단, a + b와 b + a가 같다면 a + b return

class Solution4 {
    int solution(int a, int b) {
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);

        int ia = Integer.parseInt(sa + sb);
        int ib = Integer.parseInt(sb + sa);

        return ia >= ib ? ia : ib;
    }
}

public class BiggerAddUp {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(9, 91));
        System.out.println(s4.solution(89, 8));
    }
}
