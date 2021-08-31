package glava4;

import java.util.Arrays;

public class RecursionSum {
    public int sum(int[] arr){
        if (arr.length == 0){
            return 0;
        }else return sum(arr, 0);

    }
    private int sum(int[] arr, int idx){
        if (idx == arr.length - 1){
            return arr[idx];
        }else return arr[idx] + sum(arr, idx + 1);
    }
}
