package day03;

import java.util.Arrays;

public class ArrayDelete {

    public static void main(String[] args) {
    // 삭제하고자 하는 값의 인덱스 delIndex 선정 -> 이 숫자 부터 배열 끝값까지 돌면서
    // 앞으로 이동 -> 마지막 배열의 값을 pop
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제전: "
                + Arrays.toString(arr));

        int delIndex = 0;
        //i의 시작값은 삭제하고자 하는 숫자의 인덱스
        for (int i = delIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        /*arr[1] = arr[2];
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];*/

        //pop
        // 임시배열은 기존의 배열 보다 한 칸 작게
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        //주소 바꾸기
        arr = temp; temp = null;

        System.out.println("삭제후: "
                + Arrays.toString(arr));
    }
}
