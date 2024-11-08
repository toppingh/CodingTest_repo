package me.topping.BaekJoon.Day1108;

// Title : 코딩은 체육과목입니다.
// Q. int 앞에 long을 하나씩 더 붙일 때마다 저장할 수 있는 공간이 늘어난다. N 바이트 정수까지 저장할 수 있다고 생각해 칠판에 쓴 정수 자료형의 이름은?
// Input : 첫 벚ㄴ째 줄에 문제의 정수 N이 주어진다.
// Output : N바이트 정수까지 저장할 수 있따고 생각하는 정수 자료형의 이름 출력

import java.util.Scanner;

public class CodingIsPE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i += 4) {
            System.out.print("long" + " ");
        }
        System.out.println("int");
    }
}
