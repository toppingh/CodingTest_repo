package Java.Programmers.Year2025.Mon04.Day0402;

// Title : 소수 만들기
// Q. 3개의 수를 더했을 때 소수가 되는 경우의 수를 구하려 함. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더해 소수가 되는 경우의 수를 return 하는 solutino 함수

class Solution1 {
    int solution (int[] nums) {
        int cnt = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    boolean isPrime = true;

                    if (nums[i] + nums[j] + nums[k] < 2) {
                        isPrime = false;
                    } else {
                        for (int l = 2; l * l <= nums[i] + nums[j] + nums[k]; l++) {
                            if ((nums[i] + nums[j] + nums[k]) % l == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) cnt++;
                }
            }
        }
        return cnt;
    }
}

public class MakePrimNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {1, 2, 3, 4}));
        System.out.println(s1.solution(new int[] {1, 2, 7, 6, 4}));
    }
}
