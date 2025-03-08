package Java.Programmers.Year2025.Mon03.Day0308;

// Title : 서울에서 김서방 찾기
// Q. String형 배열 seoul의 element 중 Kim 의 위치 x를 찾아, 김서방은 x에 있다는 String을 return 하는 solution 함수
// Q. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없음

class Solution3 {
    String solution (String[] seoul) {
        int answer = 0;

        for (String s : seoul) {
            if (s.equals("Kim")) break;
            answer++;
        }
        return "김서방은 " + answer + "에 있다";
    }
}

public class FindKimInSeoul {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new String[] {"Jane", "Kim"}));
    }
}
