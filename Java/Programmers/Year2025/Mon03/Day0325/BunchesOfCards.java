package Java.Programmers.Year2025.Mon03.Day0325;

// Title : 카드 뭉치
// Q. 순서대로 카드 한 장씩 사용하고 한 번 사용한 카드는 다시 사용할 수 없다.
// Q. 카드를 사용하지 않고 다음 카드로 넘어갈 수 없고 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없다.
// Q. 문자열로 이루어진 배열 cards1과 cards2, 원하는 단어 배열 goal이 매개변수로 주어질 때 cards1과 cards2에 적힌 단어들로 goal을 만들 수 있다면 "Yes", 아니면 "No"를 return 하는 solution 함수

import java.util.Objects;

class Solution2 {
    String solution (String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0, idx2 = 0;

        for (String s : goal) {
            if (idx1 < cards1.length && cards1[idx1].equals(s)) {
                idx1++;
            } else if (idx2 < cards2.length && cards2[idx2].equals(s)) {
                idx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}

public class BunchesOfCards {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new String[] {"i", "drink", "water"}, new String[] {"want", "to"}, new String[] {"i", "want", "to", "drink", "water"}));
        System.out.println(s2.solution(new String[] {"i", "water", "drink"}, new String[] {"want", "to"}, new String[] {"i", "want", "to", "drink", "water"}));
    }
}
