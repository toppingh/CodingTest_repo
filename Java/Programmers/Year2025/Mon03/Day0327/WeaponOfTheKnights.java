package Java.Programmers.Year2025.Mon03.Day0327;

// Title : 기사단원의 무기
// Q. 기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어진다.
// Q. 이때, 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution2 {
    int solution (int number, int limit, int power) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;

            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                    if (j != i / j) cnt++;
                }
            }

            sum += cnt > limit ? power : cnt;
        }

        return sum;
    }
}

public class WeaponOfTheKnights {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(5, 3, 2));
        System.out.println(s2.solution(10, 3, 2));
    }
}
