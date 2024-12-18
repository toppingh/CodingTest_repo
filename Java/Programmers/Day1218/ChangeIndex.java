package Java.Programmers.Day1218;

// Title : 인덱스 바꾸기
// Q. 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return하는 solution 함수

class Solution2 {
    String solution (String my_string, int num1, int num2) {
        char[] chars = my_string.toCharArray();

        chars[num1] = (char) (chars[num1] + chars[num2]); // num1과 num2에 해당하는 문자의 유니코드 값 더하기
        chars[num2] = (char) (chars[num1] - chars[num2]); // 더해진 값을 빼서 chars[num1]의 원래 값 가져오기
        chars[num1] = (char) (chars[num1] - chars[num2]); // 다시 빼서 chars[num2]의 원래 값 가져오기

        return new String(chars);
    }
}

public class ChangeIndex {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("hello", 1, 2));
        System.out.println(s2.solution("I love you", 3, 6));
    }
}
