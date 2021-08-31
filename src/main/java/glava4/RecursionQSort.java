package glava4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RecursionQSort {
    public void quickSort(int[] source){
        int leftBorder = 0;
        int rightBorder = source.length - 1;
        Random rnd = new Random();
        qSort(source, leftBorder, rightBorder, rnd);
    }
    public void qSort(int[] source, int leftBorder, int rightBorder, Random rnd){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[leftBorder + rnd.nextInt(rightBorder - leftBorder)];
        do {
            while (source[leftMarker] < pivot){
                leftMarker++;
            }
            while (source[rightMarker] > pivot){
                rightMarker--;
            }
            if (leftMarker <= rightMarker){
                if (leftMarker < rightMarker){
                    swap(source, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        }while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder){
            qSort(source, leftMarker, rightBorder, rnd);
        }
        if (leftBorder < rightMarker){
            qSort(source, leftBorder, rightMarker, rnd);
        }
    }
    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public int[] qSort(int[] arr){
        if (arr.length < 2){
            return arr;
        }else {
            int pivot = arr[0];
            List<Integer> less = new LinkedList<Integer>();
            List<Integer> greater = new LinkedList<Integer>();
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] >= pivot){
                    greater.add(arr[i]);
                }else {
                    less.add(arr[i]);
                }
            }
            return concat(qSort(fromListToArray(less)), pivot, qSort(fromListToArray(greater)));
        }
    }
    public List<Integer> qSort(List<Integer> unsortedList){
        if(unsortedList.size() < 2){
            return unsortedList;
        }else {
            final Integer pivot = unsortedList.get(0);
            final List<Integer> lesser = new LinkedList<>();
            final List<Integer> greater = new LinkedList<>();
            unsortedList.remove(pivot);
            for (Integer i: unsortedList){
                if (i < pivot){
                    lesser.add(i);
                }else {
                    greater.add(i);
                }
            }
            return concat(qSort(lesser), pivot, qSort(greater));
        }
    }
    private List<Integer> concat(List<Integer> lesser,Integer pivot, List<Integer> greater){
        lesser.add(pivot);
        lesser.addAll(greater);
        return lesser;
    }
    private int[] concat(int[] less, int pivot, int[] greater){
        int[] array = new int[less.length + 1 + greater.length];
        System.arraycopy(less, 0, array, 0, less.length);
        array[less.length] = pivot;
        System.arraycopy(greater, 0, array, less.length + 1, greater.length);
        return array;
    }
    private int[] fromListToArray(List<Integer> list){
        int[] array = new int[list.size()];
        int index = 0;
        for (Integer i: list) {
            array[index++] = i;
        }
        return array;
    }
}
