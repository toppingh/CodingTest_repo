package Java.Programmers.Day1212;

// Title : 합성수 찾기
// Q. 약수의 개수가 3개 이상인 수를 합성수라고 한다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return 하는 solution 함수

class Solution2 {
    int solution (int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                    if (j != i / j) cnt++;
                }
                if (cnt > 2) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

public class FindSyntheticNumber {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(10));
        System.out.println(s2.solution(15));
    }
}
