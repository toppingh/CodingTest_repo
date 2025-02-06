package Java.Programmers.Year2025.Mon02.Day0206;

// Title : 특이한 정렬
// Q. 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 한다. n으로부터 거리가 같으면 더 큰 수를 앞에 배치한다.
// Q. 정수가 담긴 배열 num_list와 정수 n이 주어질 때 numlist 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하는 solution 함수

import java.util.Arrays;

class Solution4 {
    int[] solution (int[] numlist, int n) {
       Arrays.sort(numlist);

       for (int i = 0; i < numlist.length; i++) {
           for (int j = 0; j < numlist.length; j++) {
               if (Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)) {
                   int tmp = numlist[i];
                   numlist[i] = numlist[j];
                   numlist[j] = tmp;
               }
           }
       }
       return numlist;
    }
}

public class UniqueSort {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(Arrays.toString(s4.solution(new int[] {1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(s4.solution(new int[] {10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }
}
