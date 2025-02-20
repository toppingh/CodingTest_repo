package Java.Programmers.Year2025.Mon02.Day0220;

// Title : [PCCE 기출문제] 3번 / 수 나누기
// Q. 2자리 이상의 정수 number가 주어지면 이 수를 2자리씩 자른 뒤, 자른 수를 모두 더해서 그 합을 출력하는 코드

import java.util.Scanner;

public class PCCE3_DivideNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < number % 100; i++) {
            answer += number % 100;
            number /= 100;
        }
        System.out.println(answer);
    }
}
