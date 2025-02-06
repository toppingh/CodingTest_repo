package Java.Programmers.Year2025.Mon02.Day0206;

// Title : 로그인 성공
// Q. 아이디와 패스워드가 담긴 배열 id_pw와 회원 정보가 담긴 2차원 배열 db가 주어질 때 로그인 성공, 실패에 따른 메세지를 return하는 solution 함수
// Q. 아이디와 비밀번호 모두 일치하는 회원정보가 있으면 login을 return한다.
// Q. 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 fail, 아이디는 일치, 비밀번호 일치 회원이 없으면 wrong pw return

class Solution4 {
    String solution(String[] id_pw, String[][] db) {
        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0]) && id_pw[1].equals(strings[1])) return "login";
            else if (id_pw[0].equals(strings[0]) && !id_pw[1].equals(strings[1])) return "wrong pw";
        }
        return "fail";
    }
}

public class LoginSuccess {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.solution(new String[] {"meosseugi", "1234"}, new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(s4.solution(new String[] {"programmer01", "15789"}, new String[][] {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(s4.solution(new String[] {"rabbit04", "98761"}, new String[][] {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }
}
