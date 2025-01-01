package Java.Programmers.Year2024.Day1218;

// Title : 글자 이어 붙여 문자열 만들기
// Q. 문자열 my_string과 정수 배열 index_list가 매개변수로 주어진다.
// Q. my_string의 index_list의 원소들에 해당하는 인덱스 글자들을 순서대로 이어 붙인 문자열을 return하는 solution 함수

class Solution7 {
    String solution (String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();

        for(int i : index_list) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}


public class CreateStringByConnectingLetters {
    public static void main(String[] args) {
        Solution7 s7 = new Solution7();
        System.out.println(s7.solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(s7.solution("zpiaz", new int[] {1, 2, 0, 0, 3}));
    }
}
