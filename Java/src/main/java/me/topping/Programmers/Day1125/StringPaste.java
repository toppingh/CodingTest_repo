package me.topping.Programmers.Day1125;

// Title : 문자열 붙여서 출력하기
// Q. 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으루 주어질 때 str1과 str2를 이어서 출력하는 코드
// 제한. 1 <= str1, st2의 길이 <= 10

import java.util.Scanner;

public class StringPaste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a + b);
    }
}
