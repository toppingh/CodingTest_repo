package Java.Programmers.Year2025.Mon02.Day0210;

// Title : A 강조하기
// Q. 문자열 myString에서 알파벳 a가 등장하면 전부 A로 변환하고, A가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환해 return하는 solution 함수

class Solution2 {
    String solution (String myString) {
        StringBuilder sb =  new StringBuilder();

//        for (char c : myString.toCharArray()) {
//            if (c == 'a') {
//                sb.append('A');
//            } else if (Character.isUpperCase(c) && c != 'A') {
//                sb.append(Character.toLowerCase(c));
//            } else {
//                sb.append(c);
//            }
//        }

        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');

//        return sb.toString();
        return myString;
    }
}

public class EmphasizingA {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution("aBstract algebra"));
        System.out.println(s2.solution("PrOgRaMmErS"));
    }
}
