package me.topping.Programmers.Day1125;

// Title : 대소문자 바꿔서 출력하기
// Q. 영어 알파벳으로 이루어진 문자열 str이 주어질 때, 각 알파벳을 대문자는 소문자로, 소문자는 대문자로 변환해 출력하는 코드

import java.util.Scanner;

public class ChangeUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                System.out.print(Character.toLowerCase(a.charAt(i)));
            } else {
                System.out.println(Character.toUpperCase(a.charAt(i)));
            }
        }
    }
}
