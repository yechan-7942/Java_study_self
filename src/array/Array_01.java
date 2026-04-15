package array;

import java.util.Arrays;
import java.util.Scanner;

        public class Array_01 {
            public static void main(String[] args) {

                int[] arr = new int[10];
                Scanner sc = new Scanner(System.in);

                for(int i = 0; i < arr.length; i++){
                    System.out.println("Enter number ");
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
            }
        }

