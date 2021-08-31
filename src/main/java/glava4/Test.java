package glava4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        RecursionSum rec = new RecursionSum();
        RecursionCounter counter = new RecursionCounter();
        RecursionMax max = new RecursionMax();
        int[] arr = new int[10000];
        //int[] arr = new int[13811]; StackOverflowError
        ArrayFill.fillArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(rec.sum(arr));
        System.out.println(counter.count(arr));
        System.out.println("----MAX-----");
        System.out.println(max.findMax(arr));
        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("------------QSORT-----------------");
        RecursionQSort qSort = new RecursionQSort();
        System.out.println(Arrays.toString(qSort.qSort(arr)));
        qSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new LinkedList<>(Arrays.asList(1277, 4242, 33, 12300, 442, 21, 5325, 57, 864));
        System.out.println(list);
        System.out.println(qSort.qSort(list));
    }
}
