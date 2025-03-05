package Java.Programmers.Year2025.Mon03.Day0305;

// Title : [PCCE 기출문제] 8번 / 창고 정리
// Q. 같은 물건끼리 최대한 겹쳐 쌓는 방식으로 창고를 정리하려 한다. 한 칸에 겹쳐질 수 있는 물건의 개수에는 제한이 없다고 가정한다.
// Q. 정리되기 전 창고의 물건 이름이 담긴 문자열 리스트 storage와 각 물건의 개수가 담긴 정수 리스트 num이 주어질 때, 정리된 창고에서 개수가 가장 많은 물건의 이름을 return 하는 solution 함수

class Solution1 {
    String solution (String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for (int i = 0; i < storage.length; i++) {
            int clean_idx = -1;

            for (int j = 0; j < num_item; j++) {
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }

            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}

public class CleanStorage {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(new String[] {"pencil", "pencil", "pencil", "book"}, new int[] {2, 4, 3, 1}));
        System.out.println(s1.solution(new String[] {"doll", "doll", "doll", "doll"}, new int[] {1, 1, 1, 1}));
        System.out.println(s1.solution(new String[] {"apple", "steel", "leaf", "apple", "leaf"}, new int[] {5, 3, 5, 3, 7}));
        System.out.println(s1.solution(new String[] {"mirror", "net", "mirror", "net", "bottle"}, new int[] {4, 1, 4, 1, 5}));
    }
}
