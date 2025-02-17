package Java.BaeckJoon.Year2025.Mon02.Day0217;

// Title : 공 바꾸기
// Q. M번 공을 바꾼 이후 각 바구니에 어떤 공이 들어있는지 구하는 프로그램 작성
// Input. 첫째 줄에 N, 둘째 줄부터 M개의 줄에 걸쳐 공을 교환할 방법이 주어진다. 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 의미
// Input. 입력으로 주어진 순서대로 공을 교환한다
// Output. 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

import java.util.Scanner;

public class ChangeBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] box = new int [N + 1];

        for (int i = 1; i <= N; i++) {
            box[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int tmp = box[x];
            box[x] = box[y];
            box[y] = tmp;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(box[i] + " ");
        }
    }
}
