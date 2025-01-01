package Java.Programmers.Year2024.Day1218;

// Title : 9로 나눈 나머지
// Q. 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같다.
// Q. 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return하는 solution 함수

class Solution8 {
    int solution (String number) {
        int answer = 0;

        for (char i : number.toCharArray()) {
            answer += i - '0';
        }

        return answer % 9;
    }
}

public class DividedBy9 {
    public static void main(String[] args) {
        Solution8 s8 = new Solution8();
        System.out.println(s8.solution("123"));
        System.out.println(s8.solution("78720646226947352489"));
    }
}
