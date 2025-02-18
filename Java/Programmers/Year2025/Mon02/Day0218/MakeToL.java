package Java.Programmers.Year2025.Mon02.Day0218;

// Title : l로 만들기
// Q. my_string이 주어질 때, 알파벳 순서에서 "ㅣ" 보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return하는 solution 함수

class Solution4 {
    String solution (String myString) {
        char[] str = myString.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (str[i] < 'l') {
                str[i] = 'l';
            }
        }

        return new String(str);
//        return myString.replaceAll("[a-k]", "l");
    }
}

public class MakeToL {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution("abcdevwxyz"));
        System.out.println(s4.solution("jjnnllkkmm"));
    }
}
