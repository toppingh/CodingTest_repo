package Java.Programmers.Basic;

import java.util.stream.IntStream;

class Solution {

    // 1. 정수 num1과 num2가 주어질 때 num1에서 num2를 뺀 값을 return 하는 solution 함수
    // 제한 사항 -50000 <= num1 <= 50000, -50000 <num2 <= 50000
    int solution(int num1, int num2) {
        return num1 - num2;
    }

    // 2. 정수 num1과 num2가 매개변수로 주어질 때 두 수가 같으면 1, 다르면 -1 return 하는 solution 함수
    // 제한사항 : 0 <= num1 <= 10000, 0 <= num2 <= 10000
    int solution2(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    // 3. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도 return 하는 solution 함수
    // 제한사항 : 0 < age <= 120, 나이는 태어난 연도에 1살이며 매년 1월 1일마다 1살씩 증가
    int solution3(int age) {
        return 2023 - age;
    }

    // 4. 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하는 solution 함수
    // 제한사항 : 0 < num1 <= 100, 0 < num2 <= 100
    int solution4(int num1, int num2) {
        return num1 / num2;
    }

    // 5. 정수 num1, num2가 매개변수로 주어질 때, num1과 num2를 곱한 값을 return 하는 solution 함수
    int solution5(int num1, int num2) {
        return num1 * num2;
    }

    // 6. 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 나머지를 return 하는 solution 함수
    int solution6(int num1, int num2) {
        return num1 % num2;
    }

    // 7. 정수 num1, num2가 주어질 때, num1과 num2의 합을 return 하는 solution 함수
    // 제한사항 : -50000 <= num1 <= 50000, -50000 <num2 <= 50000
    int solution7(int num1, int num2) {
        return num1 + num2;
    }

    // 8. 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분 return 하는 solution 함수
    int solution8(int num1, int num2) {
        float num3 = (float) num1 / num2;
        return (int) (num3 * 1000);
    }

    // 9. 정수 배열 numbers가 매개변수로 주어질 때, numbers의 원소의 평균값을 return 하는 solution 함수
    // 제한사항 : 0 <= numbers의 원소 <= 1,000, 1 <= numbers의 길이 <= 100
    // 제한사항 : 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어짐
    double solution9(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;

        // Solution Code - .orElse(0) : 주어진 값이 null이 아닌 경우 주어진 값 반환, null인 경우 인수 0 반환
        // import java.util.Arrays;
        // return Arrays.stream(numbers).average().orElse(0);
    }

    // 10. 각 angle(int)이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return 하는 solution 함수
    // 예각 0 ~ 89, 직각 90, 둔각 90 ~ 179, 평각 180
    int solution10(int angle) {
        return angle == 180 ? 4 : angle > 90 && angle < 180 ? 3 : angle == 90 ? 2 : angle > 0 && angle < 90 ? 1 : 0;
        // Solution Code
//        return angle == 180 ? 4 : angle > 90 ? 3 : angle == 90 ? 2 : angle > 0 ? 1 : 0;
    }

    // 11. 양꼬치 가게는 10인분 먹으면 음료수 하나가 서비스일때, 1인분에 12,000원, 음료수는 2,000원이다. n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수k개를 먹었다면 총 얼마를 지불해야하는지 return 하는 solution 함수
    int solution11(int n, int k) {
        return 12000 * n + 2000 * k - (n / 10 * 2000);
    }

    // 12. 정수 n이 주어질 때, n 이하의 짝수를 모두 더한 값을 return 하는 solution 함수
    // 제한사항 : 0 < n <= 1000
    int solution12(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    // Solution Code 1
//    int answer = 0;
//    for(int i = 2; i <= n; i+=2) {
//        answer += i;
//    }
//    return answer;

    // Solution Code 2
//    import java.util.stream.IntStream;
//    return IntStream.rangeClosed(0, n)
//            .filter(e -> e % 2 == 0)
//            .sum();

    // 13. 글자 한 자를 가로 2cm 크기로 적고, 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하는 solution 함수
    // 제한 : 공백도 문자로 취급, 1 <= message 길이 <= 50, 편지지 여백x, message는 영문 알파벳 대소문자 ~, !, 공백으로만 이루어짐
    int solution13(String message) {
        return message.length() * 2;
    }

    // 14. 세균이 1시간에 두배 증식한다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하는 solution 함수
    int solution14(int n, int t) {
        //import java.io.*;
//        return n * (int) Math.pow(2, t);

        // Solution Code
        return n << t;
    }

    // 15. 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는지 return하는 solution 함수
    int solution15(int[] array, int n) {
        int answer = 0;
        for(int i:array) {
            answer += (i == n) ? 1 : 0;
            // Solution Code
            // if (i ==n) answer++;
        }
        return answer;
    }

}