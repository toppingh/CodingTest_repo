package Java.Programmers.Day1218;

// Title : 영어가 싫어요
// Q. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return하는 solution 함수

class Solution1 {
    long solution (String numbers) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < words.length; i++) {
            numbers = numbers.replace(words[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}

public class HateEnglish {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(s1.solution("onefourzerosixseven"));
    }
}
