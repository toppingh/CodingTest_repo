package Java.Programmers.Year2025.Day0123;

// Title : 할 일 목록
// Q. 해야 할 일이 담긴 배열 todo_list와 일을 마쳤는지 나타내는 boolean 배열 finished가 매개변수로 주어질 때, todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return하는 solution 함수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    String[] solution (String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}

public class TodoList {
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(new String[] {"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[] {true, false, true, false})));
    }
}
