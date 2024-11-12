package me.topping.Day1112;

// Title : 공 넣기
// Q. 1번부터 N번까지 번호가 매겨져 있는 여러 개의 바구니가 총 N개 있다. 가장 처음 바구니에는 공이 들어가지 않고, 바구니에 공을 1개만 넣을 수 있다.
//     공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램
// I. 첫째 줄에 N과 M이 주어진다. 둘째 줄부터 M개의 줄에 걸쳐 공을 넣는 방법이 주어진다. 각 방법은 세 정수 i j k로 이루어져있고, i번 부터 j번 바구니까지 k번 번호가 적여있는 공을 넣는다는 의미다.
//      ex. 2 5 6은 2번 바구니부터 5번바구니까지 6번 공을 넣는다는 의미다.
// O. 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.

import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] baskets = new int[N];

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            int ball = sc.nextInt();

            for (int j = start; j <= end; j++) {
                baskets[j] = ball;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
