package Java.Programmers.Year2025.Day0121;

// Title : 저주의 숫자3
// Q. 3의 배수와 숫자 3을 사용하지 않는다. 정수 n이 매개변수일 때, n을 해당 조건에 맞춰 숫자로 바꾼 값을 return하는 solution 함수

class Solution3 {
    int solution (int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }

        return answer;
    }
}

public class NumberOfCurse3 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(15));
        System.out.println(s3.solution(40));
    }
}
