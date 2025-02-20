package Java.Programmers.Year2025.Mon02.Day0220;

// Title : [PCCE 기출문제] 4번 / 병과분류
// Q. 환자 코드의 마지막 네 글자를 보면 어디 병과에서 진료를 받아야 하는지 알 수 있다.
// Q. 환자 코드를 나타내는 문자열 code를 입력받아 아래에 맞는 병과를 출력하는 코드, 아래 단어로 끝나지 않으면 direct recommendation을 출력한다.
// Q. _eye - Ophthalmologyc, head - Neurosurgery, infl - Orthopedics, skin - Dermatology

import java.util.Scanner;

public class PCCE4_ClassifyOfIllness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        String lastFourWords = code.substring(code.length() - 4, code.length());

        if (lastFourWords.equals("_eye")) {
            System.out.println("Ophthalmologyc");
        } else if (lastFourWords.equals("head")) {
            System.out.println("Neurosurgery");
        } else if (lastFourWords.equals("infl")) {
            System.out.println("Orthopedics");
        } else if (lastFourWords.equals("skin")) {
            System.out.println("Dematology");
        } else {
            System.out.println("direct recommendation");
        }

    }
}
