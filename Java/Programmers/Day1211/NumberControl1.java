package Java.Programmers.Day1211;

// Title : 수 조작하기1
// Q. 정수 n과 문자열 controle이 주어진다. control은 w, a, s, d 4개의 문자로, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꾼다.
// Q. w : n이 1 커짐, s : n이 1 작아짐, d : n이 10 커짐, a : n이 10 작아짐
// Q. 위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수

class Solution2 {
    int solution (int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' : n += 1; break;
                case 's' : n -= 1; break;
                case 'd' : n += 10; break;
                case 'a' : n -= 10; break;
            }
        }
        return n;
    }
}

public class NumberControl1 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(0, "wsdawsdassw"));
    }
}
