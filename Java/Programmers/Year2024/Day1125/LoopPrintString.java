package me.topping.Programmers.Day1125;

// Title : 문자열 반복해서 출력하기
// Q. 문자열 str과 정수 n이 주어질 때 str이 n번 반복된 문자열 출력 코드

import java.util.Scanner;

public class LoopPrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }

        // Solution Code -> repeat() 메서드 사용!!
        System.out.println(str.repeat(n));
    }
}
