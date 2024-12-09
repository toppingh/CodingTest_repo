package me.topping.Programmers.Day1205;

// Title : 외계행성의 나이
// Q. a는 0, b는 1 ... j는 9이다. 나이 age가 매개변수로 주어질 때 나이를 return하는 solution 함수
class Solution2 {
    String solution (int age) {
        StringBuilder result = new StringBuilder();
        String ageStr = String.valueOf(age);

        for (char c : ageStr.toCharArray()) {
            char letter = (char) ('a' + (c - '0'));
            result.append(letter);
        }
        return result.toString();
    }
}

class SolutionCode1 {
    String solution1(int age) {
        StringBuilder sb = new StringBuilder();

        while (age > 0) {
            sb.insert(0, (char) ((age % 10) + (int)'a'));
            age /= 10;
        }

        return sb.toString();
    }
}

public class AgeOfAlienPlanet {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(23));
        System.out.println(s2.solution(51));
    }
}
