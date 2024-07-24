package work_algo.day_0723;

import java.util.Scanner;

public class 원재의_메모리_복구하기_문제풀이 {
    public static void main(String[] args) {
        //원재의 메모리 복구하기 문제 풀이
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String startnum = "0";
            int count = 0;
            String s1 = sc.nextLine().trim(); // 입력값을 읽고 양쪽 공백 제거
            String[] split = s1.split("");
            for (String s : split) {
                if (!s.equals(startnum)) {
                    count++;
                    startnum = s;
                }
            }
            System.out.println("#" + test_case + " " + count);
        }

        sc.close();
    }
}
