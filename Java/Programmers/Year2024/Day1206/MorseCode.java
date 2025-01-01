package me.topping.Programmers.Day1206;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Title : 모스부호 (1)
// Q. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하는 solution 함수
class Solution3 {
    String solution (String letter) {
        Map<String, String> morseMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] morseCode = letter.split(" ");

        morseMap.put(".-", "a");
        morseMap.put("-...", "b");
        morseMap.put("-.-.", "c");
        morseMap.put("-..", "d");
        morseMap.put(".", "e");
        morseMap.put("..-.", "f");
        morseMap.put("--.", "g");
        morseMap.put("....", "h");
        morseMap.put("..", "i");
        morseMap.put(".---", "j");
        morseMap.put("-.-", "k");
        morseMap.put(".-..", "l");
        morseMap.put("--", "m");
        morseMap.put("-.", "n");
        morseMap.put("---", "o");
        morseMap.put(".--.", "p");
        morseMap.put("--.-", "q");
        morseMap.put(".-.", "r");
        morseMap.put("...", "s");
        morseMap.put("-", "t");
        morseMap.put("..-", "u");
        morseMap.put("...-", "v");
        morseMap.put(".--", "w");
        morseMap.put("-..-", "x");
        morseMap.put("-.--", "y");
        morseMap.put("--..", "z");

        for (String s : morseCode) {
            sb.append(morseMap.get(s));
        }
        return sb.toString();
    }
}

public class MorseCode {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(".... . .-.. .-.. ---"));
        System.out.println(s3.solution(".--. -.-- - .... --- -."));
    }
}
