package Java.Programmers.Day1220;

// Title : 문자열 계산하기
// Q. my_string은 문자열로 된 수식일 때, 수식을 계산한 값을 return하는 solution 함수
// 제한. 연산자는 +, =만 존재하며, 시작과 끝에 공백이 없고 0으로 시작하지 않는다.

class Solution2 {
    int solution (String my_string) {
        String[] parts = my_string.split(" ");
        int answer = Integer.parseInt(parts[0]);

        for (int i = 1; i < parts.length; i+= 2) {
            answer += parts[i].equals("+") ? Integer.parseInt(parts[i + 1]) : -Integer.parseInt(parts[i + 1]);
        }
        return answer;
    }
}

public class CalculateString {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("3 + 4 - 1"));
        System.out.println(s2.solution("9 - 4"));
    }
}
