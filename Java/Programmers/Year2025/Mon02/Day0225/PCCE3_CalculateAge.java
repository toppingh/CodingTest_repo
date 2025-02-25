package Java.Programmers.Year2025.Mon02.Day0225;

// Title : [PCCE 기출문제] 3번 / 나이 계산
// Q. 출생 연도를 나타내는 정수 year와 구하려는 나이 종류를 나타내는 문자열 age_type이 주어질 때, 2030년에 몇 살인지 출력하는 코드
// Q. age_type이 Korea라면 한국식 나이, Year라면 연 나이를 출력한다.

import java.util.Scanner;

public class PCCE3_CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        } else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }
        System.out.println(answer);
    }
}
