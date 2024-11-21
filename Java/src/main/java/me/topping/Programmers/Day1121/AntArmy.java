package me.topping.Programmers.Day1121;

// Title : 개미군단
// Q. 장군개미는 5, 병정개미는 3, 일개미는 1의 공격성을 갖고 있다. 사냥감의 체력 hp가 매개변수로 주어질 때 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 개미가 몇 마리 필요한지 return 하는 solution 함수
// 제한. hp는 자연수이며 0 이상 1000이하다.

class Solution2 {
    int solution(int hp) {
        int answer = hp / 5;

        if (hp % 5 != 0) {
            answer += hp % 5 % 2 == 0 ? 2 : 1;
        }
        return answer;

        // Solution Code
        // return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
 }

public class AntArmy {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(23));
        System.out.println(s2.solution(23));
        System.out.println(s2.solution(999));
    }
}
