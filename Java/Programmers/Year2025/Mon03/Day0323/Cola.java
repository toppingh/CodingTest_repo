package Java.Programmers.Year2025.Mon03.Day0323;

// Title : 콜라 문제
// Q. 문제 지문 - 콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있을 때, 빈 병 20개를 가져다 주면 몇 병을 받을 수 있는가?
// Q. 콜라 빈 병 20개로 10병을 받는다. 10병을 모두 마신 뒤, 가져가서 5병을 받는다. 5병을 모두 마신 뒤, 가져가서 2병을 받고, 또 다 마신 뒤 가져가서 1병을 받는다.
// Q. 받은 1병과 5병을 받았을 때 남은 1병을 모두 마신 뒤 가져가면 1병을 또 받을 수 있다.
// Q. 총 10 + 5 + 2 + 1 + 1 = 19병의 콜라를 받을 수 있다.

// Q. 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다 주면 몇 병을 받을 수 있는지 계산하는 문제
// Q. 보유 중인 빈 병이 a개 미만이면 추가로 빈 병을 받을 수 없다.

// Q. 콜라를 받기 위해 마트에 줘야 하는 병 수 a, 빈 병 a개를 갖다주면 마트가 주는 콜라 병 수 b
// Q. 현재 상빈이가 가지고 있는 빈 병 개수 n이 매개변수로 주어질 때 상빈이가 받을 수 있는 콜라의 병 수를 return 하는 solution 함수

class Solution1 {
    int solution (int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);

        }
        return answer ;
    }
}

public class Cola {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(2, 1, 20));
        System.out.println(s1.solution(3, 1, 20));
    }
}
