package Java.Programmers.Year2025.Mon03.Day0306;

// Title : 문자열 내 p와 y의 개수
// Q.매개변수로 주어지는 문자열 s에 p의 개수와 y의 개수를 비교해 같으면 true, 다르면 false를 return 하는 solution 함수
// Q. p, y 모두 하나도 없는 경우는 항상 true return (개수 비교 시 대소문자 구별x)

class Solution5 {
    boolean solution (String s) {
        int[] arr = new int[2];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                arr[0]++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                arr[1]++;
            }
        }
        return arr[0] == arr[1];
    }
}

public class CntPnY {
    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution("pPoooyY"));
        System.out.println(s5.solution("Pyy"));
    }
}
