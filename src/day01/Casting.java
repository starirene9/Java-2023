package day01;

public class Casting {

    public static void main(String[] args) {

        byte a = 100;
        int b = a;

        //
        // +8 :  00001000
        // 1의보수 변환 : 비트 반전
        // -8 :  11110111
        // 2의보수 변환 : +1
        //       11111000

        //  00001000
        //  11111000
        //1 00000000

        // MSB : 0은 양수 , 1은 음수
        // c: 0 0000000 00000000 00000011 11101000
        int c = 1000;

        // d: 11101000
        //    00010111
        //         + 1
        //    00011000
        byte d = (byte) c;
        System.out.println("d = " + d);

        // 다운캐스팅은 데이터소실의 위험성이 있다.
        double x = 3.5566;
        int y = (int) x;
        System.out.println("y = " + y);

        short n = 20;
        byte m = (byte) n;
        System.out.println("m = " + m);


        // 타입이 다른 데이터의 연산
        // 큰 타입에 맞춰서 변환한 후 연산 진행
        int k = 100;
        double j = 5.5;

        double v = k + j;

        char c1 = 'A';
        int alpha = 1;
        System.out.println(c1 + alpha);

        // int보다 작은데이터(byte, short, char)끼리의 연산은
        // 무조건 둘 다 int로 변환된다.

        byte b1 = 100;
        byte b2 = 120;

        int b3 = b1 * b2;

        System.out.println('가' + 'A');

        int g = 24;
        double result = (double) g / 5.0;
        System.out.println("result = " + result);



    }
}
