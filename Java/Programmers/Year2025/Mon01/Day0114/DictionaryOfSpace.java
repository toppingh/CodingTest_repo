package Java.Programmers.Year2025.Mon01.Day0114;

// Title : 외계어 사전
// Q. 알파벳이 담긴 배열 spell과 외계어 사전 dic가 매개변수로 주어질 때, spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 그렇지 않으면 2를 return하는 solution 함수

class Solution2 {
    int solution(String[] spell, String[] dic) {

        for (String str : dic) {
            boolean match = true;
            for (String s : spell) {
                if (!str.contains(s)) {
                    match = false;
                    break;
                }
            }
            if (match) return 1;
        }
        return 2;
    }
}

public class DictionaryOfSpace {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new String[]{"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(s2.solution(new String[]{"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"}));
        System.out.println(s2.solution(new String[]{"s", "o", "m", "d"}, new String[] {"moos", "dzx", "smm", "sunmmo", "som"}));
    }
}
