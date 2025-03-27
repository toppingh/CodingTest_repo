package Java.Programmers.Year2025.Mon03.Day0327;

// Title : 2016년
// Q. 2016년 1월 1일은 금요일이다. 두 수 a, b가 매개변수로 주어졌을 때, 2016년 a월 b일이 무슨 요일인지 return 하는 solution 함수
// Q. 요일 이름은 일요일부터 토요일까지 각각 SUN, MON, TUE, WED, THU, FRI, SAT이며, 5월 24일 화요일은 문자열 TUE를 return 한다.

class Solution1 {
    String solution (int a, int b) {
        int[] day = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = new String[] {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int sum = 0;
        for (int i = 0; i < a - 1; i++) {
            sum += day[i];
//            System.out.println("i : " + day[i] + " sum : " + sum);
        }
        sum += b;

//        System.out.println(sum);

        return week[(sum - 1) % 7];
    }
}

public class Year2016 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(5, 3));
        System.out.println(s1.solution(5, 24));
    }
}
