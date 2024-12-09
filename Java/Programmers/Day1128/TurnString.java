package me.topping.Programmers.Day1128;

// Title : 문자열 돌리기
// Q. 문자열 str이 주어질 때, 문자열을 시계방향으로 90도 돌려서 출력하는 코드

import java.util.Scanner;

public class TurnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}
