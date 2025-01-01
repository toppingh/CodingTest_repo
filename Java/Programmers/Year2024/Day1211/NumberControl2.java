package Java.Programmers.Year2024.Day1211;

// Title : 수 조작하기2
// Q. 정수 배열 numLog가 주어지고 처음에 numLog[0]에서부터 시작해 w, a, s, d로 이루어진 문자열을 입력받아 순서대로 아래와 같이 조작한다.
// Q. w : 수에 1을 더함, s : 수에 1을 뺌, d : 수에 10을 더함, a : 수에 10을 뺌
// Q. 매번 조작할 때마다 결괏값을 기록한 정수 배열이 numLog. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있다.
// Q. 주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return하는 solution 함수

class Solution3 {
    String solution (int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];

            switch (diff) {
                case 1 : sb.append("w"); break;
                case -1 : sb.append("s"); break;
                case 10 : sb.append("d"); break;
                case -10 : sb.append("a"); break;
            }
        }
        return sb.toString();
    }
}

public class NumberControl2 {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
