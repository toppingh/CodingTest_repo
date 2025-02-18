package Java.Programmers.Year2025.Mon02.Day0218;

// Title : 커피 심부름
// Q. 메뉴만 적으면 차가운 것, 아무거나를 적은 팀원은 차가운 아메리카노로 통일.
// Q. 아메리카노 = 4500, 카페랕 = 5000
// Q. 각 직원ㅇ ㅣ적은 메뉴가 문자열 배열 order로 주어질 때, 카페에서 결제하게 될 금액을 return 하는 solution 함수

class Solution1 {
    int solution (String[] order) {
        int answer = 0;

        for (String s : order) {
            answer += s.contains("latte") ? 5000 : 4500;
        }

        return answer;
    }
}

public class ErrandForCoffee {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new String[] {"cafelatte", "americanoice", "hotcafelatte", "anyting"}));
        System.out.println(s1.solution(new String[] {"americanoice", "americano", "iceamericano"}));
    }
}
