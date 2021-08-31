package glava4;

import java.util.Arrays;

public class RecursionMax {
    public int findMax(int[] arr){
        if (arr.length == 0){
            return 0;
        }else if (arr.length == 2){
            return Math.max(arr[0], arr[1]);
        }else return findMax(arr, 0);
    }
    private int findMax(int[] arr, int startIdx){
        if (startIdx == arr.length - 1){
            return arr[startIdx];
        }else return Math.max(arr[startIdx], findMax(arr, startIdx + 1));
    }
}
