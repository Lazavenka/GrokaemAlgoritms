package glava4;

import java.util.Arrays;

public class RecursionCounter {
    public int count(int[] arr){
        if (arr.length == 0){
            return 0;
        }else {
            return count(arr, 0);
        }
    }
    private int count(int[] arr, int idx){
        if (idx == arr.length - 1){
            return 1;
        }else return 1 + count(arr, idx + 1);
    }
}
