package array;

import java.util.Arrays;

public class Array_02 {
    static void main() {
        String[] arr1 = {"홍길동", "황예찬" , "이수연"};
        String[] arr2 = {"홍길동", "황예찬" , "이수연"};
        String[] arr3 = {"홍길동", "황찬" , "이수연"};

        System.out.println("arr1 == arr2 : " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 == arr3 : " + Arrays.equals(arr1, arr3));
    }
}
