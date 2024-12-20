package Java.Programmers.Day1220;

// Title : 문자열 계산하기
// Q. my_string은 문자열로 된 수식일 때, 수식을 계산한 값을 return하는 solution 함수
// 제한. 연산자는 +, =만 존재하며, 시작과 끝에 공백이 없고 0으로 시작하지 않는다.

import java.util.Arrays;

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

// SolutionCode2 - Stream 활용하기
class SolutionCode2 {
    int solution (String my_string) {
        return Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
        // "- " -> "-"로 변경, "+ " -> "" (빈 문자열)로 변경, "[+]" -> "" 정확히 +인 문자 찾기
        // trim() -> 양쪽 끝 공백 제거, " 3 5 - 2 " => "3 5 - 2"
        // split(" ") -> 공백 기준으로 나눔, "3 5 - 2" => ["3", "5", "-2"]
        // mapToInt(Integer::parseInt) -> 각 문자열을 정수로 변환, => 각각 3, 5, -2
        // sum() -> 배열의 모든 요소의 합 => 3 + 5 + (-2) 를 계산한 6 반환
    }
}

public class CalculateString {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        SolutionCode2 sc2 = new SolutionCode2();

        System.out.println(s2.solution("3 + 4 - 1"));
        System.out.println(s2.solution("9 - 4"));
        System.out.println();

        System.out.println(sc2.solution("3 + 4 - 1"));
        System.out.println(sc2.solution("9 - 4"));

    }
}
