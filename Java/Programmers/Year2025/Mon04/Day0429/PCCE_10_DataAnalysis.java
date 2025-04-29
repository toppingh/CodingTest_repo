package Java.Programmers.Year2025.Mon04.Day0429;

// Title : [PCCE 기출문제] 10번 / 데이터 분석
// Q. data는 [code, date, maximum, remain] 으로 구성되어 있다. 데이터를 뽑아내는 기준을 의미하는 ext, 뽑아낼 정보의 기준값을 나타내는 val_ext, 정보를 정렬할 기준이 되는 문자열 sort_by가 주어진다.
// Q. data에서 ext 값이 val_ext보다 작은 데이터만 추출해, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬해 return 하는 solution 함수

import java.util.*;

class Solution2 {
    int[][] solution (int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        map.put("code", 1);
        map.put("date", 2);
        map.put("maximum", 3);
        map.put("remain", 4);

        for (int[] datum : data) {
            if (datum[map.get(ext) - 1] < val_ext) {
                list.add(datum);
            }
        }

        list.sort(Comparator.comparingInt(a -> a[map.get(sort_by) - 1]));

        return list.toArray(new int[list.size()][]);
    }
}

public class PCCE_10_DataAnalysis {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.deepToString(s2.solution(new int[][] {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain")));
    }
}
