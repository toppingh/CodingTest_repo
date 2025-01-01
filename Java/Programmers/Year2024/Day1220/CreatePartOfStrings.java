package Java.Programmers.Year2024.Day1220;

// Title : 부분 문자열 이어 붙여 문자열 만들기
// Q. 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어진다.
// Q. parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미한다.
// Q. 각 my_strings의 원소 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return하는 solution 함수

class Solution4 {
    String solution(String[] my_strings, int[][] parts) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            str.append(my_strings[i], parts[i][0], parts[i][1] + 1);
            System.out.println(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return str.toString();
    }
}

public class CreatePartOfStrings {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}
