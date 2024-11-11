package me.topping.Programmers.Day1111;

// Title : 배열 두 배 만들기
// Q. 정수 배열 numbers가 매개변수로 주어질 때, numbers의 각 원소에 두 배한 원소를 가진 배열 return하는 함수

class doubleArr {
    int[] arr(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}

public class DoubleArray {
    public static void main(String[] args) {

        doubleArr arr = new doubleArr();
        int[] result = arr.arr(new int[]{1, 2, 3, 4, 5});

        for(int i : result) System.out.print(i + " ");
    }
}
