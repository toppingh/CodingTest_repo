package Java.Programmers.Year2025.Day0203;

// Title : 유한소수 판별하기
// Q. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려한다.
// Q. 기약분수로 나타냈을 때, 분모의 소인수가 2와 5만 존재하면 유한소수가 되기 위한 분수의 조건을 만족한다.
// Q. 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1, 무한소수면 2를 return하는 solution 함수

class Solution3 {
    int solution (int a, int b) {

        int i = a, j = b;
        while (j != 0) {
            int tmp = j;
            j = i % j;
            i = tmp;
        }

        b /= i;

        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        return (b == 1) ? 1 : 2;
    }
}

public class DiscriminateFinitePrimeNumbers {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(7, 20));
        System.out.println(s3.solution(11, 22));
        System.out.println(s3.solution(12, 21));
    }
}
