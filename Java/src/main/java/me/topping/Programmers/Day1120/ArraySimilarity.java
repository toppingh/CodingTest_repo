package me.topping.Programmers.Day1120;

// Title : 배열의 유사도
// Q. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return 하는 solution 함수
// 제한. s1과 s2의 원소는 알파벳 소문자로만 이루어져 있고, 각각 중복된 원소를 갖지 않는다.

class Solution1 {
    int solution(String[] s1, String[] s2) {

        int cnt = 0;

        for (int i = 0; i < s2.length; i++) {
            for (int j = i; j < s1.length; j++) {
                if (s1[i].equals(s2[j])) cnt++;
            }
        }
        return cnt;
    }
}

public class ArraySimilarity {
    public static void main(String[] args) {

        Solution1 s1 = new Solution1();
        s1.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
    }
}
