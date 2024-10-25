package me.topping;

class Solution {

    // 1. 정수 num1과 num2가 주어질 때 num1에서 num2를 뺀 값을 return 하는 solution 함수
    // 제한 사항 -50000 <= num1 <= 50000, -50000 <num2 <= 50000
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    // 2. 정수 num1과 num2가 매개변수로 주어질 때 두 수가 같으면 1, 다르면 -1 return 하는 solution 함수
    // 제한사항 : 0 <= num1 <= 10000, 0 <= num2 <= 10000
    public int solution2(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    // 3. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도 return 하는 solution 함수
    // 제한사항 : 0 < age <= 120, 나이는 태어난 연도에 1살이며 매년 1월 1일마다 1살씩 증가
    public int solution3(int age) {
        return 2023 - age;
    }

    // 4. 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하는 solution 함수
    // 제한사항 : 0 < num1 <= 100, 0 < num2 <= 100
    public int solution4(int num1, int num2) {
        return num1 / num2;
    }

    // 5. 정수 num1, num2가 매개변수로 주어질 때, num1과 num2를 곱한 값을 return 하는 solution 함수
    public int solution5(int num1, int num2) {
        return num1 * num2;
    }

    // 6. 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 나머지를 return 하는 solution 함수
    public int solution6(int num1, int num2) {
        return num1 % num2;
    }

    // 7. 정수 num1, num2가 주어질 때, num1과 num2의 합을 return 하는 solution 함수
    // 제한사항 : -50000 <= num1 <= 50000, -50000 <num2 <= 50000
    public int solution7(int num1, int num2) {
        return num1 + num2;
    }

    // 8. 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분 return 하는 solution 함수
    public int solution8(int num1, int num2) {
        float num3 = (float) num1 / num2;
        return (int) (num3 * 1000);
    }

    // 9. 정수 배열 numbers가 매개변수로 주어질 때, numbers의 원소의 평균값을 return 하는 solution 함수
    // 제한사항 : 0 <= numbers의 원소 <= 1,000, 1 <= numbers의 길이 <= 100
    // 제한사항 : 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어짐
    public double solution9(int[] numbers) {
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
    public int solution10(int angle) {
        return angle == 180 ? 4 : angle > 90 && angle < 180 ? 3 : angle == 90 ? 2 : angle > 0 && angle < 90 ? 1 : 0;
        // Solution Code
//        return angle == 180 ? 4 : angle > 90 ? 3 : angle == 90 ? 2 : angle > 0 ? 1 : 0;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
}