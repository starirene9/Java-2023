package day03;

public class ArraySearch {
    static String[] foods = {"삼겹살", "족발", "피자", "햄버거"};

    public static int indexOf(String target) {
        // 인덱스 탐색 알고리즘
//        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
//                index = i;
//                break;
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        foods[2] = "치킨";

        int index = indexOf("족발");

        System.out.println("찾은 인덱스: " + index);

    }
}
