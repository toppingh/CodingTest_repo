package Java.Programmers.Year2025.Mon02.Day0214;

// Title : 배열 비교하기
// Q. 두 배열의 길이가 다르면 배열 길이가 더 큰 쪽이 더 크고, 길이가 같으면 각 배열에 있는 모든 원소의 합을 비교한다.
// Q. 두 정수 arr1이 크면 1, ar2가 크면 -1, 같다면 0을 return 하는 solution 함수

 class Solution2 {
     int solution (int[] arr1, int[] arr2) {
         int answer = 0;

         if (arr1.length != arr2.length) {
             return arr1.length > arr2.length ? 1 : -1;
         }
         for (int i = 0; i < arr1.length; i++) {
             answer += arr1[i] - arr2[i];
         }

         return Integer.compare(answer, 0);
     }
 }

public class CompareArray {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(new int[] {49, 13}, new int[] {70, 11, 2}));
        System.out.println(s2.solution(new int[] {100, 17, 84, 1}, new int[] {55, 12, 65, 36}));
        System.out.println(s2.solution(new int[] {1, 2, 3, 4 ,5}, new int[] {3, 3, 3, 3, 3}));
    }
}
