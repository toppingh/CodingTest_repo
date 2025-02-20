package Java.Programmers.Year2025.Mon02.Day0220;

// Title : [PCCE 기출문제] 2번 / 각도 합치기
// Q. 각도에 360의 배수를 더하거나 빼도 같은 각을 의미한다. 각도를 나타내는 두 정수 angle1과 angle2가 주어질 때, 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드가 올바르게 작동하도록 작성하시오.

import java.util.Scanner;

public class PCCE2_CombiningAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2) % 360;

        System.out.println(sum_angle);
    }
}
