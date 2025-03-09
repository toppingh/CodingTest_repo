package Java.Programmers.Year2025.Mon03.Day0309;

// Title : 콜라츠 추측
// Q. 콜라츠 추측 : 주어진 수가 1이 될 때까지 아래 작업을 반복하면 모든 수를 1로 만들 수 있다는 추측
// Q. 1. 입력된 수가 짝수면 2로 나누고, 홀수면 3을 곱하고 1을 더한다.
// Q. 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복한다.
// Q. 위 작업을 몇 번 반복해야 하는지 반환하는 solution 함수
// Q. 주어진 수가 1인 경우에 0을, 작업을 500번 반복할 때까지 1이 되지 않으면 -1 return

class Solution1 {
    int solution (int num) {
        int cnt = 0;

        while (num != 1 && cnt < 500) {
            num = (num % 2 == 0) ? (num / 2) : (num * 3 + 1);
            cnt++;
        }

        return (cnt == 500) ? -1 : cnt;
    }
}

public class CollatzGuess {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(6));
        System.out.println(s1.solution(16));
        System.out.println(s1.solution(626331));
    }
}
