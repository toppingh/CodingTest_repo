package Java.Programmers.Year2025.Mon03.Day0312;

// Title : 직사각형 별찍기
// Q. 두 개의 정수 n과 m이 주어질 때, 별(*) 문자를 이용해 가로 길이가 n, 세로 길이가 m인 직사각형 형태 출력

import java.util.Scanner;

public class RectangularStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
