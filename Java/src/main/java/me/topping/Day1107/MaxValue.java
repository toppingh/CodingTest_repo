package me.topping.Day1107;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

//import static java.util.Arrays.stream;

class Solution1 {
    int solution(int[] numbers) {
        List<Integer> list = stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());

        return list.get(0) * list.get(1);
    }
}

public class MaxValue {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
    }
}
