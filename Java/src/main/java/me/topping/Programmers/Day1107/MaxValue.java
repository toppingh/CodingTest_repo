package me.topping.Programmers.Day1107;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

//import static java.util.Arrays.stream;

class Solution1 {
    int solution(int[] numbers) {
        List<Integer> list = stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());

        return list.get(0) * list.get(1);

        // Solution Code

//        Arrays.sort(numbers);
//        return numbers[numbers.length - 1] * numbers[numbers.length - 2];

        // Solution Code 2
//        numbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
//        int answer = numbers[0] * numbers[1];
//        return answer;
    }
}

public class MaxValue {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
    }
}
