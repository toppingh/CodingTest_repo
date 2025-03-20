package Java.Programmers.Year2025.Mon03.Day0320;

// Title : 숫자 문자열과 영단어
// Q. 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어진다. s가 의미하는 원래 숫자를 return 하는 solution 함수

class Solution2 {
    int solution (String s) {
        String[] num = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < num.length; i++) {
            s = s.replaceAll(num[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}

public class NumStringEnglishWord {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("one4seveneight"));
        System.out.println(s2.solution("23four5six7"));
        System.out.println(s2.solution("123"));
    }
}
