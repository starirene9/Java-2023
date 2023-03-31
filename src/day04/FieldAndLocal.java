package day04;

public class FieldAndLocal {
//하하ㅎㅎ
    int a;  // 필드

    void mm(int b) { // b: 매개변수
        int c;      // c: 지역변수

        if (a > 10) {
            c = 99;
        } else if (a < 5) {
            c = -100;
        } else {
            c = 55;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
