package me.topping.Programmers.Day1202;

// Title : 문자 리스트를 문자열로 변환하기
// Q. 문자들이 담겨있는 배열 arr이 주어질 때 arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수

class Solution2 {
    String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}

public class ChangeToString {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new String[]{"a", "b", "c"}));
    }
}
