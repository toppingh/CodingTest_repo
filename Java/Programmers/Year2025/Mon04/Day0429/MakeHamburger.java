package Java.Programmers.Year2025.Mon04.Day0429;

// Title : 햄버거 만들기
// Q. 빵-야채-고기-빵 순서로 햄버거만 포장해야 한다.
// Ex. 앞에 싸인 재료가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵] 순서일 때, 6번째 재료가 쌓였을 때, 3번째 재료부터 6번째 재료를 이용해 포장하고
// Ex. 9번째 재료가 쌓였을 때, 2번째 재료와 7번째 재료부터 9번째 재료를 이용해 햄버거를 포장한다.
// Ex. 즉, 2개의 햄버거를 포장하게 된다.
// Q. 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때, 포장하는 햄버거의 개수를 return 하는 solution 함수

class Solution1 {
     int solution (int[] ingredient) {
         int[] list = new int [ingredient.length];
         int idx = 0, cnt = 0;

         for (int i : ingredient) {
             list[idx++] = i; // 재료를 list에 추가

             if (idx >= 4 && list[idx - 4] == 1 && list[idx - 3] == 2 && list[idx - 2] == 3 && list[idx - 1] == 1) {
                 idx -= 4;
                 cnt++;
             }
         }
         return cnt;
     }
 }

public class MakeHamburger {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s1.solution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }
}
