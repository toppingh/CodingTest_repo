package me.topping.Programmers.Day1125;

// Title : 홀짝 구분하기
// Q. 자연수 n이 입력으로 주어졌을 때 n이 짝수면 "n is even", 홀수면 "n is odd" 출력하는 코드

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? n + " is even" : n + " is odd");

        // Solution code
        System.out.println(n + " is " + (n % 2 == 0? "even" : "odd"));
    }
}
