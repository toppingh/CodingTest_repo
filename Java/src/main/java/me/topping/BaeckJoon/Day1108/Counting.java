package me.topping.BaeckJoon.Day1108;

// Title : 개수 세기
// Q. 총 N개의 정수가 주어졌을때 v가 몇 개인지 구하는 프로그램
// Input : 첫째 줄에 정수 개수 N, 둘째 줄에 정수가 공백으로 구분되어있고, 셋째 줄에는 찾으려고 하는 정수 v
// Output : 첫째 줄에 입력으로 주어진 N개의 정수 중 v가 몇 개인지 출력

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int j = 0; j < arr.length; j++) {
            if (v == arr[j]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
