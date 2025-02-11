package Java.Programmers.Year2025.Mon02.Day0210;

// Title : k의 개수
// Q. 정수 ㅑ, j, k가 매개변수로 주어질 때, i부터 j까지 k가 등장하는 횟수를 return 하는 solution 함수

class Solution7 {
    int solution (int i, int j, int k) {
        int answer = 0;
        String idx = String.valueOf(k); // 비교대상인 k를 String 타입으로 변환

        for (int l = i; l <= j; l++) {
            // int -> String타입으로 변환 후 char 타입 배열을 이요한 비교
            for (char c : String.valueOf(l).toCharArray()) {
                // k와 같은 문자가 있으면 answer 증가
                if (String.valueOf(c).equals(idx)) answer++;
            }
        }
        return answer;
    }
}

public class CountOfK {
    public static void main(String[] args) {
        Solution7 s7 = new Solution7();
        System.out.println(s7.solution(1, 13, 1));
        System.out.println(s7.solution(10, 50, 5));
        System.out.println(s7.solution(3, 10, 2));
    }
}
