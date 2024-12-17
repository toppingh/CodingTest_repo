package Java.Programmers.Day1217;

// Title : 369게임
// Q. 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return하는 solution 함수

class Solution7 {
    int solution (int order) {
        int answer = 0;

        while (order > 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                answer++;
            }
            order /= 10;
        }

        return answer;
    }
}

public class GameOf369 {
    public static void main(String[] args) {
        Solution7 s7 = new Solution7();
        System.out.println(s7.solution(3));
        System.out.println(s7.solution(29423));
    }
}
